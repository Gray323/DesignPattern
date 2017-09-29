package com.rxd.designpattern.FactoryPattern;

/**
 * Created by Administrator on 2017/9/28.
 */

public class CreateComputer {

    public static void main(String[] args){
        ComputerFactory.createComputer("hp").start();
    }


}
