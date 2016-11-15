package com.nothingoneday.aop.refactor;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

/**
 * Created by jinghongjun on 15/11/2016.
 */
public class CGLIBMathProxy implements MethodInterceptor {

    private Object mTargetObject;

    public Object getCGLIBMathProxy(Object object){

        this.mTargetObject = object;

        //增强器，动态代码生成器
        Enhancer enhancer = new Enhancer();

        //回调方法
        enhancer.setCallback(this);

        //设置生成类的父类类型
        enhancer.setSuperclass(mTargetObject.getClass());

        //动态生成字节码并返回代理对象
        return enhancer.create();



    }

    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        //之前运行内容
        long start = System.currentTimeMillis();
        lazy();

        Object result = methodProxy.invoke(mTargetObject, args);

        //之后运行内容
        Long span = System.currentTimeMillis() - start;
        System.out.println("span："+span);

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
