package com.fengcbo.basics.cglib.beans.copy;

import net.sf.cglib.core.KeyFactory;

public class KeyFactoryTest {

    /**
     * {@link KeyFactory} 动态生成接口的实例，接口只能包含一个返回 Object 的 newInstance 方法，参数任意
     * <p>
     *     <pre>
     *         public interface SampleKeyFactoryInterface {
     *              Object newInstance(String value);
     *         }
     *     </pre>
     * </p>
     *
     * 假设 {@link KeyFactory} 生成的 SampleKeyFactoryInterface 实例名为 factory，
     * 调用 factory 的 newInstance 方法生成的对象会被动态添加 {@link Object#equals(Object)} 和 {@link Object#hashCode()}，
     * 能够确保相同的参数构造出的实例相等（调用 {@link #equals(Object)} 返回 true）。
     * @param args
     */
    public static void main(String[] args) {
        SampleKeyFactoryInterface keyFactoryInterface = (SampleKeyFactoryInterface) KeyFactory.create(SampleKeyFactoryInterface.class);
        Object src1 = keyFactoryInterface.newInstance("src value");
        Object src2 = keyFactoryInterface.newInstance("src value");
        System.out.println(src1 == src2);
        System.out.println(src1.equals(src2));
        System.out.println(src1.getClass().getName());
    }
}
