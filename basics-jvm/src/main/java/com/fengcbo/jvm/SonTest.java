package com.fengcbo.jvm;

public class SonTest {

    public static void main(String[] args) {
        Father person = new Son();
        person.printX();
    }
}

class Father {

    public int x = 10;

    public Father() {
        this.printX();
        this.x = 20;
    }

    public void printX() {
        System.out.println("Father.x = " + this.x);
    }
}

class Son extends Father {

    public int x = 30;

    public Son() {
        this.printX();
        this.x = 40;
    }

    @Override
    public void printX() {
        System.out.println("Son.x = " + this.x);
    }
}
