package com.hejianlin.design_mode_demo.factory.original;
/**
 * 计算机类
 */
public class Operation {
    public double calculate(double num1,double num2,String operate){
        double result=0d;
        switch (operate){
            case "+": result=num1+num2; break;
            case "-": result=num1-num2; break;
            case "*": result=num1*num2; break;
            case "/":
                if(num2==0d){
                    throw new RuntimeException("除数不能为0");
                }
                result=num1/num2;
                break;
            default:
                throw new RuntimeException("运算符非法");
        }
        return result;
    }
}
