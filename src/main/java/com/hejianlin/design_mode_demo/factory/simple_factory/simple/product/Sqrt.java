package com.hejianlin.design_mode_demo.factory.simple_factory.simple.product;

import com.hejianlin.design_mode_demo.factory.simple_factory.simple.Operation;

import java.util.List;

public class Sqrt extends Operation {

    @Override
    public double calculate(Double... num) {
        List<Double> paramList = getParam(1, num);
        return Math.sqrt(paramList.get(0));
    }
}
