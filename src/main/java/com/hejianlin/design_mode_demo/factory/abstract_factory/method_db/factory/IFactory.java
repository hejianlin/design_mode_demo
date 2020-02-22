package com.hejianlin.design_mode_demo.factory.abstract_factory.method_db.factory;

import com.hejianlin.design_mode_demo.factory.abstract_factory.method_db.produce.IUserOperation;

public interface IFactory {
    IUserOperation createUser();
}
