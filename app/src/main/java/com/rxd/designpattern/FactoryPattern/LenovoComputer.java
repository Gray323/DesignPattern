package com.rxd.designpattern.FactoryPattern;

/**
 * Created by Administrator on 2017/9/30.
 */

public class LenovoComputer extends Computer{
    @Override
    public void start() {
        System.out.println("联想电脑启动");
    }
}
