package com.fengcbo.jvm;

import sun.misc.Launcher;
import sun.misc.URLClassPath;

import java.util.Arrays;

/**
 * @author fengchuanbo
 * @date 2020/7/12
 */
public class ClassLoaderTest {

    public static void main(String[] args) {
        // 获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println("系统类加载器：" + systemClassLoader.getClass().getName());

        // 获取扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println("扩展类加载器：" + extClassLoader.getClass().getName());

        // 获取引导类加载器 -- 引导类加载器无法获取到，返回 null
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println("引导类加载器（获取不到）：" + bootstrapClassLoader);

        // 当前类加载器
        ClassLoader currentClassLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println("当前类加载器：" + currentClassLoader.getClass().getName());

        // String 的类加载器为 引导类加载器，所以获取为 null
        ClassLoader stringClassLoader = String.class.getClassLoader();
        System.out.println("String 类加载器为 引导类加载器（获取不到）：" + stringClassLoader);

        URLClassPath bootstrapClassPath = Launcher.getBootstrapClassPath();
        System.out.println("===================启动类加载器加载的所有路径======================");
        Arrays.stream(bootstrapClassPath.getURLs()).forEach(System.out::println);

        String extDirs = System.getProperty("java.ext.dirs");
        System.out.println("===================扩展类加载器加载的所有路径======================");
        Arrays.stream(extDirs.split(";")).forEach(System.out::println);
    }
}
