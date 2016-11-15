package com.nothingoneday.aop.refactor;


/**
 * 真实对象
 */
public class Math implements IMath{


    public int add(int number1, int number2){

        int result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        return result;

    }

    public int  sub(int number1, int number2){

        int result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        return result;

    }

    public int mut(int number1, int number2){

        int result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        return result;

    }

    public int div(int number1, int number2){

        int result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        return result;

    }

}
