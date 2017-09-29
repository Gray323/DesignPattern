package com.rxd.designpattern.AgentPattern;

/**
 * Created by Gray on 2017/9/29.
 * 代理类
 */

public class Purchasing implements IShop{

    private IShop mShop;

    public Purchasing(IShop mShop) {
        this.mShop = mShop;
    }

    @Override
    public void buy() {
        mShop.buy();
    }
}
