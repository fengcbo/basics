package com.fengcbo.jvm;

public class DynamicInstruction {

    public static void main(String[] args) {
        test(() -> System.out.println("lambda"));
    }

    public static void test(DynamicLambda lambda) {
        lambda.run();
    }
}

@FunctionalInterface
interface DynamicLambda {

    void run();
}