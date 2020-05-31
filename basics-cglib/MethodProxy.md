当被拦截的方法被执行时，由 Enhancer 生成的类会将 MethodProxy 
对象传递给被注册的 MethodInterceptor 对象。
MethodProxy 用来执行原方法或者调用相同类型的对象的相同方法。