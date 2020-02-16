package com.hejianlin.design_mode_demo.factory.simple_factory.simple.product;

import com.hejianlin.design_mode_demo.factory.simple_factory.simple.Operation;

import java.math.BigDecimal;
import java.util.List;

public class Division extends Operation {

    @Override
    public double calculate(Double... num) {
        List<Double> paramList = getParam(2, num);
        if(paramList.get(1)==0d){
            throw new RuntimeException("除数不能为0");
        }
        BigDecimal decimal1 = new BigDecimal(paramList.get(0));
        BigDecimal decimal2 = new BigDecimal(paramList.get(1));
        return decimal1.divide(decimal2,2,BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
