package com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db;

import com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.factory.IFactory;
import com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.factory.OracleFactory;
import com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.produce.IDepartmentOperation;
import com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.produce.IUserOperation;
import com.hejianlin.design_mode_demo.factory.abstract_factory.original_db.Department;
import com.hejianlin.design_mode_demo.factory.abstract_factory.original_db.User;

public class Test {

    @org.junit.Test
    public void test(){
        IFactory factory=new OracleFactory();
        IUserOperation userOperation = factory.createUser();
        IDepartmentOperation departmentOperation = factory.createDepartment();

        System.out.println("用户操作：");
        User user = new User();
        userOperation.insert(user);
        userOperation.select(1);


        System.out.println("部门操作：");
        Department department = new Department();
        departmentOperation.insert(department);
        departmentOperation.select(1);
    }
}
