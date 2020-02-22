package com.hejianlin.design_mode_demo.factory.abstract_factory.access_db;

import com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.factory.IFactory;
import com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.produce.IDepartmentOperation;
import com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.produce.IUserOperation;
import com.hejianlin.design_mode_demo.factory.abstract_factory.original_db.Department;
import com.hejianlin.design_mode_demo.factory.abstract_factory.original_db.User;

public class Test {

    @org.junit.Test
    public void test(){

        //客户端这里不用直接指定数据库类型，也不需要知道数据库类型，所以数据库更换时，客户端代码无需修改。
        IFactory factory = DataAccess.createFactory();

        User user = new User();
        IUserOperation userOperation = factory.createUser();
        userOperation.insert(user);
        userOperation.select(1);

        Department department = new Department();
        IDepartmentOperation departmentOperation = factory.createDepartment();
        departmentOperation.insert(department);
        departmentOperation.select(1);

    }
}
