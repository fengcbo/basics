package com.fengcbo.jvm;

/**
 * -Xms100m -Xmx100m -XX:+DoEscapeAnalysis -XX:+PrintGC -XX:-EliminateAllocations
 * -Xms100m -Xmx100m -XX:+DoEscapeAnalysis -XX:+PrintGC -XX:+EliminateAllocations
 */
public class ScalarReplaceTest {

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            alloc();
        }
        System.out.println("执行时间：" + (System.currentTimeMillis() - start) + " ms");
        Thread.sleep(100000000L);
    }

    public static void alloc() {
        User user = new User();
        user.id = 1;
        user.name = "fengchuanbo";
    }

    public static class User {

        int id;
        String name;
    }
}
