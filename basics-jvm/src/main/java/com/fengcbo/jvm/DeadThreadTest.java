package com.fengcbo.jvm;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author fengchuanbo
 * @date 2020/7/12
 */
public class DeadThreadTest {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName() + "开始");
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            DeadThread deadThread = new DeadThread();
            System.out.println(Thread.currentThread().getName() + "结束");
        };
        Thread thread1 = new Thread(runnable, "thread1");
        Thread thread2 = new Thread(runnable, "thread2");
        thread1.start();
        thread2.start();
    }

}

class DeadThread {

    static {
        if (true) {
            System.out.println(Thread.currentThread().getName() + " 初始化当前类：" + DeadThread.class.getName());
            while (true) {
                break;
            }
        }
    }
}
