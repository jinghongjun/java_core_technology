package com.nothingoneday.generics;

/**
 * Created by jinghongjun on 16/11/2016.
 */
public class Container01 {

    private String mKey;
    private String mValue;

    public Container01(String k, String v){
        mKey = k;
        mValue = v;
    }

    public String getKey() {
        return mKey;
    }

    public String getValue() {
        return mValue;
    }

    public void setKey(String mKey) {
        this.mKey = mKey;
    }

    public void setValue(String mValue) {
        this.mValue = mValue;
    }

    @Override
    public String toString() {
        return "key: " + getKey() + ", value: " + getValue();
    }
}
