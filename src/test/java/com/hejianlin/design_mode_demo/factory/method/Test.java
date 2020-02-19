package com.hejianlin.design_mode_demo.factory.method;

import com.hejianlin.design_mode_demo.factory.method.factory.AdditionFactory;
import com.hejianlin.design_mode_demo.factory.simple.Operation;

public class Test {

    @org.junit.Test
    public void test(){
        OperationFactory factory = new AdditionFactory();
        Operation operation = factory.createProduct();
        double result = operation.calculate(14.0, 18.0);
        System.out.println("计算结果："+result);
    }
}
