package com.fengcbo.basics.cglib.enhancer;

public class BaseClass {

    public void normalMethod() {
        System.out.println("BaseClass normalMethod ...");
    }

    public final void finalMethod() {
        System.out.println("BaseClass finalMethod ...");
    }
}
