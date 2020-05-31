package com.fengcbo.basics.cglib.beans.copy;

import net.sf.cglib.beans.BeanCopier;

public class BeanCopierTest {

    /**
     * 将一个 Bean 属性 copy 到另一个 Bean，并提供一个转换器用于自定义转换过程
     * @param args
     */
    public static void main(String[] args) {
        BeanCopier beanCopier = BeanCopier.create(CopyBeanSrc.class, CopyBeanDist.class, false);
        CopyBeanSrc src = new CopyBeanSrc("src value");
        CopyBeanDist dist = new CopyBeanDist();
        beanCopier.copy(src, dist, null);
        System.out.println(dist.getValue());
    }
}
