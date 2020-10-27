package com.fengcbo.jvm;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceTest {

    public static PhantomReferenceTest obj = null;
    public static ReferenceQueue<PhantomReferenceTest> queue = new ReferenceQueue<>();

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    Reference<? extends PhantomReferenceTest> remove = queue.remove();
                    PhantomReferenceTest phantomReferenceTest = remove.get();
                    System.out.println("通知获取的 PhantomReferenceTest 为 null 吗？" + (phantomReferenceTest == null));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setDaemon(true);
        thread.start();

        obj = new PhantomReferenceTest();
        PhantomReference<PhantomReferenceTest> phantomReference = new PhantomReference<>(obj, queue);
        System.out.println("调用 get() 获取原始引用：（肯定为null）" + phantomReference.get());
        obj = null;
        System.gc();
        Thread.sleep(1000);
        if (obj == null){
            System.out.println("第一次 obj 是 null");
        }else {
            System.out.println("obj 不为 null， 可用");
        }

        System.out.println("第二次 GC");
        obj = null;
        System.gc();
        Thread.sleep(1000);
        if (obj == null){
            System.out.println("第二次 obj 是 null");
        }else {
            System.out.println("obj 不为 null， 可用");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("调用 finalize() 方法");
        obj = this;
    }
}
