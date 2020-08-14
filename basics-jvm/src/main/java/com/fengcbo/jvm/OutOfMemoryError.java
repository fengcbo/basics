package com.fengcbo.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * -Xmx64M
 */
public class OutOfMemoryError {

    public static void main(String[] args) throws InterruptedException {
        List<byte[]> arr = new ArrayList<>();
        while (true){
            Thread.sleep(20);
            arr.add(new byte[1024 * 1024]);
        }
    }
}
