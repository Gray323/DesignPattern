package com.rxd.designpattern.BuilderPattern;

/**
 * Created by Gray on 2017/9/28.
 */

public class CreateComputer {
    public static void main(String[]args){
        Builder mBuilder=new MoonComputerBuilder();
        Dirextor mDirecror=new Dirextor(mBuilder);
        //组装电脑
        mDirecror.CreateComputer("i7-6700","华擎玩家至尊","三星DDR4");
    }
}
