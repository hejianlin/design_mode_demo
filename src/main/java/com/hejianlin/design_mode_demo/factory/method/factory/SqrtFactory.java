package com.hejianlin.design_mode_demo.factory.method.factory;

import com.hejianlin.design_mode_demo.factory.method.OperationFactory;
import com.hejianlin.design_mode_demo.factory.simple.Operation;
import com.hejianlin.design_mode_demo.factory.simple.product.Sqrt;

public class SqrtFactory implements OperationFactory {
    @Override
    public Operation createProduct() {
        return new Sqrt();
    }
}
