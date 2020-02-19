package com.hejianlin.design_mode_demo.factory.simple;

import com.hejianlin.design_mode_demo.factory.simple.factory.OperationFactory;

public class Test {

    @org.junit.Test
    public void test(){
        Operation sqrt = OperationFactory.createOperation("sqrt");
        double calculate = sqrt.calculate(9.0);
        System.out.println("计算结果："+calculate);
    }
}
