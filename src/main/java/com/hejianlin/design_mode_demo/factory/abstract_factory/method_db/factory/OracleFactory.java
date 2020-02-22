package com.hejianlin.design_mode_demo.factory.abstract_factory.method_db.factory;

import com.hejianlin.design_mode_demo.factory.abstract_factory.method_db.produce.IUserOperation;
import com.hejianlin.design_mode_demo.factory.abstract_factory.method_db.produce.OracleUser;

public class OracleFactory implements IFactory {

    @Override
    public IUserOperation createUser() {
        return new OracleUser();
    }
}
