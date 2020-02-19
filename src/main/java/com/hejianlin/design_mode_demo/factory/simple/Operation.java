package com.hejianlin.design_mode_demo.factory.simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 计算接口(抽象类)
 */
public abstract class Operation {

    /**
     * 计算方法
     * @author: POI-TECH
     * @date: 2020/2/16 20:58
     * @Param: [num]
     * @return: double
     */
    public abstract double calculate(Double... num);


    /**
     * 取得运算参数
     * @author: POI-TECH
     * @date: 2020/2/16 15:04
     * @Param: [size, num]
     * @return: java.util.List<java.lang.Double>
     */
    protected List<Double> getParam(int size,Double... num){
        List<Double> paramList=new ArrayList<>();

        if(num.length<size){
            throw new RuntimeException("参数个数错误");
        }

        for(int i=0;i<size;i++){
            if(num[i]!=null){
                paramList.add(num[i]);
            }
        }

        if(paramList.size()<size){
            throw new RuntimeException("参数个数错误");
        }

        //转化为不可变列表
        Collections.unmodifiableList(paramList);
        return paramList;
    }
}
