package com.rxd.designpattern.AgentPattern;

/**
 * Created by Gray on 2017/9/29.
 * 客户端类
 */

public class Client {
    public static void main(String[] args){
        IShop my = new My();
        IShop purchasing = new Purchasing(my);
        purchasing.buy();
    }
}
