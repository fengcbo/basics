字节码生成库 cglib 是高层次的api，用来生成和转化 java 字节码。

cglib 可以被 AOP、测试以及数据访问框架 用来生成动态代理对象以及拦截属性的访问。

1. cglib-#.#_#.jar 只包含 CGLIB 的 class 文件，它依赖于 ASM 的 API，仅仅被用来扩展 cglib。
2. cglib-nodep-#.#_#.jar 重命名了 ASM class 文件，是不能扩展的。