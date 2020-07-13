package com.fengcbo.jvm;

/**
 * @author fengchuanbo
 * @date 2020/7/12
 */
public class ClinitTest {

    private static int a = 1;

    static {
        a = 2;
        num = 20;
        // 非法的前向引用
        // System.out.println(num);
    }

    private static int num = 10;

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(num);
    }
}
