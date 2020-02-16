package com.hejianlin.design_mode_demo.factory.simple_factory.simple.factory;

import com.hejianlin.design_mode_demo.factory.simple_factory.simple.Operation;
import com.hejianlin.design_mode_demo.factory.simple_factory.simple.product.*;

public class OperationFactory {
    public static Operation createOperation(String operate){
        Operation operation=null;
        if(operate==null || operate.length()<=0){
            throw new RuntimeException("参数错误");
        }
        switch (operate){
            case "+": operation = new Addition(); break;
            case "-": operation = new Subtraction(); break;
            case "*": operation = new Multiplication(); break;
            case "/": operation = new Division(); break;
            case "sqrt": operation = new Sqrt(); break;
            default:
                throw new RuntimeException("参数错误");
        }
        return operation;
    }
}
