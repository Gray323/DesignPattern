package com.rxd.designpattern.BuilderPattern;

/**
 * Created by Gray on 2017/9/28.
 * 指挥者类统一组装过程
 */

public class Dirextor {
    Builder mBuild = null;
    public Dirextor(Builder build){
        this.mBuild = build;
    }
    public Computer CreateComputer(String cpu, String mainboard, String ram){
        //规范建造流程
        this.mBuild.builMainboard(mainboard);
        this.mBuild.buildCpu(cpu);
        this.mBuild.buildRam(ram);
        return mBuild.create();
    }
}
