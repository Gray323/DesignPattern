package com.rxd.designpattern.SinglePattern;

/**
 * Created by Gray on 2017/9/28.
 * 静态内部类单例模式
 */

public class Singleton5 {
    private Singleton5(){

    }
    public static Singleton5 getInstance(){
        return SingletonHolder.sIntance;
    }
    private static class SingletonHolder{
        private static final Singleton5 sIntance = new Singleton5();
    }
}
