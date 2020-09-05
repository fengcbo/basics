package com.fengcbo.jvm;

public class ObjectLayout {

    public static void main(String[] args) {
        Customer cust = new Customer();
    }

    static class Customer {

        private int id = 1001;

        private String name = "匿名用户";

        private Account acct = new Account();
    }

    static class Account {

    }
}


