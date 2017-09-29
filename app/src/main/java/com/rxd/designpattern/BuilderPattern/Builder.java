package com.rxd.designpattern.BuilderPattern;

/**
 * Created by Gray on 2017/9/28.
 * builder类规范产品的组建
 */

public abstract class Builder {
    public abstract void buildCpu(String cpu);
    public abstract void builMainboard(String mainboard);
    public abstract void buildRam(String ram);
    public abstract Computer create();
}
