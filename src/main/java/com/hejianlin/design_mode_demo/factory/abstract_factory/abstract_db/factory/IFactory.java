package com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.factory;

import com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.produce.IDepartmentOperation;
import com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.produce.IUserOperation;

public interface IFactory {
    IUserOperation createUser();
    IDepartmentOperation createDepartment();
}
