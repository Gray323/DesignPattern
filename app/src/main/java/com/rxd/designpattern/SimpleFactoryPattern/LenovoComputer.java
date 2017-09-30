package com.rxd.designpattern.SimpleFactoryPattern;

/**
 * Created by Administrator on 2017/9/28.
 */

public class LenovoComputer extends Computer{
    @Override
    public void start() {
        System.out.print("联想电脑启动");
    }
}
