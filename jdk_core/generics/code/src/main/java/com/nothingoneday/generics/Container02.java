package com.nothingoneday.generics;

/**
 * Created by jinghongjun on 16/11/2016.
 */
//在编译期，是无法知道K和V具体是什么类型，只有在运行时才会真正根据类型来构造和分配内存
public class Container02<K, V> {

    private K mKey;
    private V mValue;

    public Container02(K k, V v) {
        mKey = k;
        mValue = v;
    }

    public K getKey() {
        return mKey;
    }

    public V getValue() {
        return mValue;
    }

    public void setKey(K mKey) {
        this.mKey = mKey;
    }

    public void setValue(V mValue) {
        this.mValue = mValue;
    }

    @Override
    public String toString() {
        return "key: " + getKey() + ", value: " + getValue();
    }
}
