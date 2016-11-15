package com.nothingoneday.aop.refactor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * Created by jinghongjun on 15/11/2016.
 */
public class JDKMathProxy implements InvocationHandler {

    //被代理对象
    private Object mTargetObject;

    /**
     *
     * @param object：真实对象
     * @return 代理对象
     */
    public Object getJDKMathProxyObject(Object object){

        this.mTargetObject = object;

        return Proxy.newProxyInstance(
                mTargetObject.getClass().getClassLoader(),  //类加载器:由哪个ClassLoader对象来生成代理对象进行加载
                mTargetObject.getClass().getInterfaces(),   //获得真实对象所有接口:一个Interface对象的数组，表示的是我将要给我需要代理的对象提供一组什么接口，如果我提供了一组接口给它，那么这个代理对象就宣称实现了该接口(多态)，这样我就能调用这组接口中的方法了
                this                                        //InvocationHandler:当我这个动态代理对象在调用方法的时候，会关联到哪一个InvocationHandler对象上，间接通过invoke来执行
        );

    }

    /**
     *
     * @param proxy: 代理对象
     * @param method: 执行的方法
     * @param args: 执行方法传递的参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        //之前运行内容
        long start=System.currentTimeMillis();
        lazy();

        //通过反射调用真实对象方法
        Object result = method.invoke(mTargetObject, args);

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
