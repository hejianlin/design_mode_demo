package com.hejianlin.design_mode_demo.factory.abstract_factory.method_db;

import com.hejianlin.design_mode_demo.factory.abstract_factory.method_db.factory.IFactory;
import com.hejianlin.design_mode_demo.factory.abstract_factory.method_db.factory.OracleFactory;
import com.hejianlin.design_mode_demo.factory.abstract_factory.method_db.produce.IUserOperation;
import com.hejianlin.design_mode_demo.factory.abstract_factory.original_db.User;

public class Test {

    @org.junit.Test
    public void test(){

        IFactory factory=new OracleFactory();
        IUserOperation userOperation = factory.createUser();

        User user=new User();
        userOperation.insert(user);
        userOperation.select(1);

    }
}
