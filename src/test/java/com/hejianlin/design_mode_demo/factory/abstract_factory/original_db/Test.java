package com.hejianlin.design_mode_demo.factory.abstract_factory.original_db;

public class Test {
    @org.junit.Test
    public void test(){
        User user =new User();
        SqlserverUser sqlserverUser = new SqlserverUser();
        sqlserverUser.insert(user);
        sqlserverUser.select(1);
    }
}
