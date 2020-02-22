package com.hejianlin.design_mode_demo.factory.abstract_factory.access_config_db;

import com.hejianlin.design_mode_demo.DesignModeDemoApplication;
import com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.factory.IFactory;
import com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.produce.IDepartmentOperation;
import com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.produce.IUserOperation;
import com.hejianlin.design_mode_demo.factory.abstract_factory.original_db.Department;
import com.hejianlin.design_mode_demo.factory.abstract_factory.original_db.User;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignModeDemoApplication.class)
public class Test {

    @Autowired
    private DataAccess dataAccess;

    @org.junit.Test
    public void test(){

        IFactory factory = dataAccess.createFactory();

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
