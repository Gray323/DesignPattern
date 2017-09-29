package com.rxd.designpattern.FlyWeight;

/**
 * Created by Gray on 2017/9/29.
 * 具体享元角色
 */

public class Goods implements IGoods{

    private String name;
    private String version;

    Goods(String name){
        this.name = name;
    }

    @Override
    public void showGoodsPrice(String name) {
        if (version.equals("32")){
            System.out.println("5199");
        }else if (version.equals("128")){
            System.out.println("5999");
        }
    }
}
