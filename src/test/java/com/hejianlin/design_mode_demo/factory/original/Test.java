package com.hejianlin.design_mode_demo.factory.original;

public class Test {

    @org.junit.Test
    public void test(){
        Operation operation = new Operation();
        double calculate = operation.calculate(6, 4, "/");
        System.out.println(calculate);
    }
}
