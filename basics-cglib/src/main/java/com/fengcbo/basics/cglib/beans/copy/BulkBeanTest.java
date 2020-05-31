package com.fengcbo.basics.cglib.beans.copy;

import net.sf.cglib.beans.BulkBean;

import java.util.Arrays;

public class BulkBeanTest {

    /**
     * {@link BulkBean} 提供了 getPropertyValues 和 setPropertyValues 用于操作对象属性的获取和修改。
     * {@link BulkBean} 适用于类型不确定，但属性名已确定的场景。
     * @param args
     */
    public static void main(String[] args) {
        BulkBean bulkBean = BulkBean.create(CopyBeanSrc.class, new String[]{"getValue"}, new String[]{"setValue"}, new Class[]{String.class});
        CopyBeanSrc src = new CopyBeanSrc("src value");
        Object[] propertyValues = bulkBean.getPropertyValues(src);
        System.out.println("get properties starting....");
        Arrays.stream(propertyValues).forEach(System.out::println);
        System.out.println("get properties end....");
        bulkBean.setPropertyValues(src, new String[]{"after set value"});
        System.out.println(src.getValue());
    }
}
