package com.fengcbo.jvm;

import java.util.LinkedList;
import java.util.List;

/**
 * -Xms9m -Xmx9m -XX:+PrintGCDetails
 */
public class GCTest {

    public static void main(String[] args) {
        int index = 0;

        try {
            String a = "fengcbo.com";
            List<String> data = new LinkedList<>();
            while (true){
                index++;
                a += a;
                data.add(a);
            }
        }catch (Throwable e) {
            e.printStackTrace();
            System.out.println("遍历次数：" + index);
        }
    }
}
