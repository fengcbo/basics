package com.fengcbo.jvm;

/**
 * -Xms1G -Xmx1G -XX:-DoEscapeAnalysis -XX:+PrintGCDetails
 * -Xms1G -Xmx1G -XX:+DoEscapeAnalysis -XX:+PrintGCDetails
 * -Xms256m -Xmx256m -XX:-DoEscapeAnalysis -XX:+PrintGCDetails
 * -Xms256m -Xmx256m -XX:+DoEscapeAnalysis -XX:+PrintGCDetails
 */
public class EscapeAnalysisTest {

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            alloc();
        }
        System.out.println("执行时间：" + (System.currentTimeMillis() - start) + " ms");
        Thread.sleep(100000000L);
    }

    public static void alloc() {
        UserTest userTest = new UserTest();
    }

    static class UserTest {

    }
}
