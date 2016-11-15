1.code_refactoring_01

    获取Math每个方法耗时时间

        1.多个方法需要修改
        2.违反DIP(依赖反转)，抽象不应该依赖细节，两个都应该依赖抽象。在Client类中，Math和Client都是细节
        3.违反SRP(单一职责)，每个方法除了完成自身功能，还要计算耗时时间
        4.违反OCP(开闭原则)，对扩展开放，对修改关闭，增加功能把每个方法都修改了


2.code_refactoring_02
        静态代理

        1.如果项目中有多个类，则需要编写多个代理类，工作量大，不好修改，不好维护，不能应对变化

3.code_refactoring_03

        JDK动态代理
        JDK内置的Proxy动态代理可以在运行时动态生成字节码，而没必要针对每个类编写代理类。中间主要使用到了一个接口InvocationHandler与
        Proxy.newProxyInstance静态方法
        使用内置的Proxy实现动态代理有一个问题：被代理的类必须实现接口，未实现接口则没办法完成动态代理

4.code_refactoring_04

        CGLIB动态代理
        cglib可以在运行时动态生成字节码,是一个强大的，高性能，高质量的Code生成类库，它可以在运行期扩展Java类与实现Java接口