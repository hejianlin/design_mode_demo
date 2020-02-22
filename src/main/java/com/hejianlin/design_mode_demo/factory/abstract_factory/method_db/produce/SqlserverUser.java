package com.hejianlin.design_mode_demo.factory.abstract_factory.method_db.produce;

import com.hejianlin.design_mode_demo.factory.abstract_factory.original_db.User;

public class SqlserverUser implements IUserOperation {
    @Override
    public void insert(User user) {
        System.out.println("Sqlserver：插入一条user记录");
    }

    @Override
    public User select(int id) {
        System.out.println("Sqlserver: 查询一条user记录");
        return null;
    }
}
