package com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.produce;

import com.hejianlin.design_mode_demo.factory.abstract_factory.original_db.User;

public class OracleUser implements IUserOperation {

    @Override
    public void insert(User user) {
        System.out.println("Oracle：插入一条user记录");
    }

    @Override
    public User select(int id) {
        System.out.println("Oracle: 查询一条user记录");
        return null;
    }
}
