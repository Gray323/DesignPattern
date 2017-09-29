package com.rxd.designpattern.FactoryPattern;

/**
 * Created by Administrator on 2017/9/28.
 */

public class AsusComputer extends Computer{
    @Override
    public void start() {
        System.out.print("华硕电脑启动");
    }
}
