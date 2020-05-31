package com.fengcbo.basics.cglib.beans.copy;

import net.sf.cglib.beans.BeanMap;

public class BeanMapTest {

    /**
     * 将 JavaBean 以 Map 的方式操作。
     * <pre>
     *     1. JavaBean 的所有属性作为 key
     *     2. 对于只读属性，如果更改将会被忽略
     *     3. 对于只写属性，如果获取将返回 null
     *     4. 不支持删除操作
     * </pre>
     * @param args
     */
    public static void main(String[] args) {
        CopyBeanSrc src = new CopyBeanSrc("src value");
        BeanMap beanMap = BeanMap.create(src);
        System.out.println(beanMap.get("value"));
    }
}
