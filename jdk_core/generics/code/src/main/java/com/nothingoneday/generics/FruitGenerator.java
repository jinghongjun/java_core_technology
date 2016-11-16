package com.nothingoneday.generics;

import java.util.Random;

/**
 * Created by jinghongjun on 16/11/2016.
 */
public class FruitGenerator implements Generator<String>{

    private String[] fruits = new String[]{"Apple", "Banana", "Pear"};

    public String next() {
        Random rand = new Random();
        return fruits[rand.nextInt(3)];
    }

}
