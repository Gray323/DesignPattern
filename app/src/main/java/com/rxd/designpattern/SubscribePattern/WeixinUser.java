package com.rxd.designpattern.SubscribePattern;

/**
 * Created by Gray on 2017/9/28.
 * 具体观察者
 */

public class WeixinUser implements Observer{

    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
