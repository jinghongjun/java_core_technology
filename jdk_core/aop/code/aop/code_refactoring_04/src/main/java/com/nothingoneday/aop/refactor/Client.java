package com.nothingoneday.aop.refactor;

/**
 * Created by jinghongjun on 15/11/2016.
 */
public class Client {


    public static void main(String [] args){

        Math math = (Math) new CGLIBMathProxy().getCGLIBMathProxy(new Math());
        int number1 = 100;
        int number2 = 5;

        math.add(number1, number2);
        math.sub(number1, number2);
        math.mut(number1, number2);
        math.div(number1, number2);

    }
}
