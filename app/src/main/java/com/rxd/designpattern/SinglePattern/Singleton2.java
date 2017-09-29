package com.rxd.designpattern.SinglePattern;

/**
 * Created by Gray on 2017/9/28.
 * 懒汉模式(线程不安全)
 */

public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){

    }
    public static Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
