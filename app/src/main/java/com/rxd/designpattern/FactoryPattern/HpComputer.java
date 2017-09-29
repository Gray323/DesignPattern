package com.rxd.designpattern.FactoryPattern;

/**
 * Created by Administrator on 2017/9/28.
 */

public class HpComputer extends Computer{
    @Override
    public void start() {
        System.out.print("惠普电脑启动");
    }
}
