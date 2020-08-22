package com.fengcbo.jvm;

/**
 * 锁消除/同步省略
 */
public class LockUpTest {

    public static void main(String[] args) {
        lock();
        noLock();
    }

    public static void lock() {
        LockUpTest lockUpTest = new LockUpTest();
        synchronized (lockUpTest) {
            System.out.println(lockUpTest);
        }
    }

    public static void noLock() {
        LockUpTest lockUpTest = new LockUpTest();
        System.out.println(lockUpTest);
    }
}
