package com.rxd.designpattern.FlyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Gray on 2017/9/29.
 * 享元工厂
 */

public class GoodsFactory {

    private static Map<String,Goods> pool = new HashMap<>();
    public static Goods getGoods(String name){
        if (pool.containsKey(name)){
            System.out.println("使用缓存,key为:" + name);
            return pool.get(name);
        }else{
            Goods goods = new Goods(name);
            pool.put(name, goods);
            System.out.print("创建商品,key为:" + name);
            return goods;
        }
    }

}
