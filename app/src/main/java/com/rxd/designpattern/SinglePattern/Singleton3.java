package com.rxd.designpattern.SinglePattern;

/**
 * Created by Gray on 2017/9/28.
 * 懒汉模式(线程安全)
 */

public class Singleton3 {
    private static Singleton3 instance;
    private Singleton3(){

    }
    public static synchronized Singleton3 getInstance(){
        if (instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}
