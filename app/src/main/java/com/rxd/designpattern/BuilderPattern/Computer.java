package com.rxd.designpattern.BuilderPattern;

/**
 * Created by Gray on 2017/9/28.
 * 产品类
 */

public class Computer {

    private String mCpu;
    private String mMainboard;
    private String mRam;

    public void setmCpu(String mCpu) {
        this.mCpu = mCpu;
    }

    public void setmMainboard(String mMainboard) {
        this.mMainboard = mMainboard;
    }

    public void setmRam(String mRam) {
        this.mRam = mRam;
    }
}
