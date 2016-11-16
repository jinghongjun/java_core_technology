package com.nothingoneday.generics;

/**
 * Created by jinghongjun on 16/11/2016.
 */
public class Client {


    public static <T> void out(T t) {
        System.out.println(t);
    }

    public static <T> void out(T... args) {
        for (T t : args) {
            System.out.println(t);
        }
    }

    public static void main(String[] args){

        //泛型接口
        FruitGenerator generator = new FruitGenerator();
        System.out.println(generator.next());
        System.out.println(generator.next());
        System.out.println(generator.next());
        System.out.println(generator.next());

        //泛型类
        //未使用泛型类
        Container01 c01 = new Container01("1", "1");
        System.out.println(c01);

        //使用泛型类
        Container02<String, String> c02 = new Container02<String, String>("1", "2");
        System.out.println(c02);


        Container02<String, Integer> c03 = new Container02<String, Integer>("1", 2);
        System.out.println(c03);


        Container02<Double, String> c04 = new Container02<Double, String>(1d, "2");
        System.out.println(c04);

        //泛型方法
        //一个基本的原则是：无论何时，只要你能做到，你就应该尽量使用泛型方法。也就是说，如果使用泛型方法可以取代将整个类泛化，那么应该有限采用泛型方法
        //可以看到方法的参数彻底泛化了，这个过程涉及到编译器的类型推导和自动打包，也就说原来需要我们自己对类型进行的判断和处理，现在编译器帮我们做了。这样在定义方法的时候不必考虑以后到底需要处理哪些类型的参数，大大增加了编程的灵活性
        out("findingsea");
        out(123);
        out(11.11);
        out(true);

        out("findingsea", 123, 11.11, true);


    }



}
