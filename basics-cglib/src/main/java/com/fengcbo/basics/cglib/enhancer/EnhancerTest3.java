package com.fengcbo.basics.cglib.enhancer;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.Factory;
import net.sf.cglib.proxy.MethodInterceptor;

public class EnhancerTest3 {

    /**
     * <p>
     * 1. Enhancer 用于生成代理对象。<br>
     * 2. 被代理类不能是 final 类，因为 Enhancer 会动态生成被代理类的子类<br>
     * 3. MethodInterceptor 只会复写非 final 的方法，无法复写 final 方法<br>
     * 4. Enhancer 生成的代理对象都会实现 {@link Factory}
     * </p>
     * @param args
     */
    public static void main(String[] args) {
        BaseClass baseClass = (BaseClass)Enhancer.create(BaseClass.class, (MethodInterceptor) (obj, method, args1, proxy) -> {
            System.out.println("before method invoke...");
            Object result = proxy.invokeSuper(obj, args1);
            System.out.println("after method invoke...");
            return result;
        });

        baseClass.normalMethod();
        baseClass.finalMethod();
        System.out.println("baseClass instanceof Factory:" + (baseClass instanceof Factory));
    }
}
