package com.rxd.designpattern.BuilderPattern;

/**
 * Created by Gray on 2017/9/28.
 * 用于组装电脑
 */

public class MoonComputerBuilder extends Builder{

    private Computer mComputer = new Computer();

    @Override
    public void buildCpu(String cpu) {
        mComputer.setmCpu(cpu);
    }

    @Override
    public void builMainboard(String mainboard) {
        mComputer.setmMainboard(mainboard);
    }

    @Override
    public void buildRam(String ram) {
        mComputer.setmRam(ram);
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
