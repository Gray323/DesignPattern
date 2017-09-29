package com.rxd.designpattern.AgentPattern;

/**
 * Created by Gray on 2017/9/29.
 * 真实主题类
 */

public class My implements IShop{
    @Override
    public void buy() {
        System.out.println("购买");
    }
}
