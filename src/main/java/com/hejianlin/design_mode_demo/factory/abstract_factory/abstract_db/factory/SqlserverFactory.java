package com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.factory;

import com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.produce.IDepartmentOperation;
import com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.produce.IUserOperation;
import com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.produce.SqlserverDepartment;
import com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.produce.SqlserverUser;

public class SqlserverFactory implements IFactory {

    @Override
    public IUserOperation createUser() {
        return new SqlserverUser();
    }

    @Override
    public IDepartmentOperation createDepartment() {
        return new SqlserverDepartment();
    }
}
