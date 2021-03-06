动态生成子类来完成方法拦截。Enhancer 是 JDK1.3 开始引入的标准动态代理的替代类，
但是它允许代理具体的基类而不需要实现自接口。动态生成的子类会复写父类非 final 的方法，
并具有回调用户自定义拦截器的钩子。


最常用的回调类型是 MethodInterceptor，它在 AOP 的术语中叫做"around advice"，
也就是说在父类方法执行前或执行后，你可以执行自定义代码。此外，你也可以在调用父类方法前修改参数，
或者压根不执行父类方法。


虽然通常情况下 MethodInterceptor 足够满足遇到的拦截需求，但经常矫枉过正。
为了简单性和高性能，其他的特殊回调类型，比如 LazyLoader ，同样可以。
通常每个增强的类都会使用一个回调，但是您可以使用 CallbackFilter 控制每个方法使用哪个回调。


通常我们只会使用这个类的静态帮助方法。但为了一些高级需求，比如 使用自定义 ClassLoader，你需要创建一个新的 Enhancer
实例。CGLIB 中的其他类也遵循类似的规则。


所有增强的对象都实现了 Factory 接口，除非使用 setUseFactory 明确禁用这个特性。
Factory 接口提供了 API 用以更改现有对象的回调，以及创建相同类型的新实例的更快更简单的方法。