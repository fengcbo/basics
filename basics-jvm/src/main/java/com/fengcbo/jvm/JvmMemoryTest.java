package com.fengcbo.jvm;

/**
 * -XX:SurvivorRatio=8
 * -Xms600M -Xmx600M -Xmn300M
 */
public class JvmMemoryTest {

    public static void main(String[] args) {
        long totalMemory = Runtime.getRuntime().totalMemory();
        System.out.println("总内存：\t" + (totalMemory / 1024 / 1024) + "M");

        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("最大内存：\t" + (maxMemory / 1024 / 1024) + "M");

        long freeMemory = Runtime.getRuntime().freeMemory();
        System.out.println("空闲内存：\t" + (freeMemory / 1024 / 1024) + "M");

        try {
            Thread.sleep(1000000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
