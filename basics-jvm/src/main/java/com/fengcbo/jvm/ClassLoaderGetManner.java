package com.fengcbo.jvm;

/**
 * @author fengchuanbo
 * @date 2020/7/12
 */
public class ClassLoaderGetManner {

    public static void main(String[] args) {
        // 1. 获取类的类加载器
        ClassLoader currentClassLoader = ClassLoaderGetManner.class.getClassLoader();
        System.out.println("当前类的类加载器：" + currentClassLoader);

        // 2. 获取线程上线文类加载器
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        System.out.println("线程上线文类加载器：" + contextClassLoader);

        // 3. 获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println("系统类加载器：" + systemClassLoader);
    }
}
