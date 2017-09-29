package com.rxd.designpattern.SinglePattern;

/**
 * Created by Gray on 2017/9/28.
 * 单例饿汉模式
 * 类加载慢，获取对象速度快
 * 基于类加载机制，避免多线程同步问题
 */

public class Singleton1 {

    private static Singleton1 instance = new Singleton1();
    private Singleton1(){

    }
    public static Singleton1 getInstance(){
        return instance;
    }

}
