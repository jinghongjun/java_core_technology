package com.nothingoneday.aop.refactor;

import java.util.Random;

/**
 * Created by jinghongjun on 15/11/2016.
 */
public class MathProxy implements  IMath{

    private IMath mMath;

    public MathProxy(){
        mMath = new Math();
    }

    public int add(int number1, int number2) {

        long start = System.currentTimeMillis();

        lazy();

        int result = mMath.add(number1, number2);

        long span = System.currentTimeMillis() - start;
        System.out.println("time: " + span);

        return result;

    }

    public int sub(int number1, int number2) {

        long start = System.currentTimeMillis();

        lazy();

        int result = mMath.sub(number1, number2);

        long span = System.currentTimeMillis() - start;
        System.out.println("time: " + span);

        return result;

    }

    public int mut(int number1, int number2) {

        long start = System.currentTimeMillis();

        lazy();

        int result = mMath.mut(number1, number2);

        long span = System.currentTimeMillis() - start;
        System.out.println("time: " + span);

        return result;

    }

    public int div(int number1, int number2) {

        long start = System.currentTimeMillis();

        lazy();

        int result = mMath.div(number1, number2);

        long span = System.currentTimeMillis() - start;
        System.out.println("time: " + span);

        return result;
    }

    private void lazy(){
        int n = new Random().nextInt(5000);
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
