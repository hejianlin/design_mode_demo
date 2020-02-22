package com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.factory;

import com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.produce.IDepartmentOperation;
import com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.produce.IUserOperation;
import com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.produce.OracleDepartment;
import com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.produce.OracleUser;

public class OracleFactory implements IFactory {

    @Override
    public IUserOperation createUser() {
        return new OracleUser();
    }

    @Override
    public IDepartmentOperation createDepartment() {
        return new OracleDepartment();
    }
}
