泛型
    将类型由原来的具体的类型参数化，类似于方法中的变量参数，此时类型也定义成参数形式，然后在使用/调用时传入具体的类型

泛型定义和使用

    类型参数的命名风格：
        推荐使用简练的名字作为形式类型参数的名字，最好避免小写字母，这使它和其他的普通的形式参数很容易被区分开来
        使用T代表类型，无论何时都没有比这更具体的类型类区分它，如果有多个类型参数，我们可能使用字母中T临近的字母，比如S
        如果一个泛型函数在一个泛型类里面出现，最好避免在方法的类型参数和类的类型参数中使用同样的名字来避免混淆，对内部类也是同样

     1.定义带类型参数的类
        在定义带类型参数的类时，在紧跟类名之后的<>内，指定一个或多个类型参数的名字，同时也可以对类型参数取值范围进行限定，多个类型
 参数之间用，号分割
        在定义带类型参数的类后，可以在定义未知之后的类的几乎任意地方（静态块、静态属性、静态方法除外）使用类型参数，就像使用普通的
 类型一样。
        注意。父类定义的类型参数不能被子类继承

     2.定义带类型参数的方法
        在定义带类型参数的方法时，在紧跟课件范围修饰符之后的<>内，指定一个或多个类型参数的名字，同时也可以对类型参数的取值范围进行
  限定，多个类型参数之间用，号分割
        在定义带类型参数的方法后，可以在定义位置之后的任意地方使用类型参数，就像使用普通的类型一样。
        这样。定义带类型参数的方法，主要目的是为了表达多个参数以及返回值之间的关系。

     3.通配符
        对是类型参数赋予具体的值，除此，还可以对类型参数赋予不确定值

        List<?> unknownList;
        List<? extends Number> unknownNumberList;
        List<? super Integer> unknownBaseLineIntgerList;

泛型参数赋值

    1.对带类型参数的类赋值
        1）声明类变量
            List<String> list = new ArrayList<String>;

        2)继承类或者实现接口

            public class MyList<E> extends ArrayList<E> implements List<E> {...}

    2.对带类型参数方法进行赋值

        当调用范型方法时，编译器自动对类型参数进行赋值，当不能成功赋值时报编译错误


实现原理

泛型使用场景
    在具体使用时，可以分为泛型接口、泛型类和泛型方法
