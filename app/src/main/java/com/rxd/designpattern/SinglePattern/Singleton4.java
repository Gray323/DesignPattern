package com.rxd.designpattern.SinglePattern;

/**
 * Created by Gray on 2017/9/28.
 * 双重检查模式(DCL)
 * 建议用静态内部类单例模式来替代DCL
 */

public class Singleton4 {
    private volatile static Singleton4 instance;
    private Singleton4(){

    }
    public static Singleton4 getInstance(){
        if (instance == null){
            synchronized (Singleton4.class){
                if (instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
