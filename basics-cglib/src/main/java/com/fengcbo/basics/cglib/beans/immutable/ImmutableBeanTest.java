package com.fengcbo.basics.cglib.beans.immutable;

import net.sf.cglib.beans.ImmutableBean;

public class ImmutableBeanTest {

    /**
     * ImmutableBean 用于生成不可变 Bean
     * <pre>
     *     1. ImmutableBean 会创建一个原来对象的包装类，包装类不可变
     *     2. 不可变只得是不能通过 setter 方法修改属性值
     *     3. public 属性可以直接通过包装类修改
     *     4. 包装类依然可以通过非 setter 方法修改属性值
     *     5. 包装类会包含源对象的引用，并且会重写 setter（抛出异常） 和 getter（直接访问源对象属性） 方法，其他方法中使用 this 访问属性为空
     * </pre>
     * @param args
     */
    public static void main(String[] args) {
        ImmutableBeanSample sample = new ImmutableBeanSample("first");
        sample.name = "firstName";
        ImmutableBeanSample proxy = (ImmutableBeanSample) ImmutableBean.create(sample);
//        proxy.name = "secondName";
        // proxy.setValue("second");
//        sample.setValue("thirdName");
        sample.addValue("otherName");
        System.out.println(proxy.getValue());
    }
}
