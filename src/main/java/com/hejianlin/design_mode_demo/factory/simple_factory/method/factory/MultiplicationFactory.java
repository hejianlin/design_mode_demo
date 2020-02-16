package com.hejianlin.design_mode_demo.factory.simple_factory.method.factory;

import com.hejianlin.design_mode_demo.factory.simple_factory.method.OperationFactory;
import com.hejianlin.design_mode_demo.factory.simple_factory.simple.Operation;
import com.hejianlin.design_mode_demo.factory.simple_factory.simple.product.Multiplication;
import com.hejianlin.design_mode_demo.factory.simple_factory.simple.product.Subtraction;

public class MultiplicationFactory implements OperationFactory {
    @Override
    public Operation createProduct() {
        return new Multiplication();
    }
}