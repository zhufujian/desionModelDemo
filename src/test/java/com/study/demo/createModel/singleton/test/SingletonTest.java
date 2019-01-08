package com.study.demo.createModel.singleton.test;

import com.study.demo.createModel.singleton.HungrySingleton;
import com.study.demo.createModel.singleton.LazySingleton;

public class SingletonTest
{
    public static void main(String[] args)
    {
    	lazyTest();
    	hungryTest();
    }
    
    private static void lazyTest(){
    	LazySingleton.getInstance();
    	System.out.println("==============");
    	LazySingleton.getInstance();
    }
    private static void hungryTest(){
    	HungrySingleton.getInstance();
    	System.out.println("==============");
    	HungrySingleton.getInstance();
    }
}
