package com.hejianlin.design_mode_demo.factory.simple.product;

import com.hejianlin.design_mode_demo.factory.simple.Operation;

import java.util.List;

public class Multiplication extends Operation {

    @Override
    public double calculate(Double... num) {
        List<Double> paramList = getParam(2, num);
        return paramList.get(0)*paramList.get(1);
    }
}
