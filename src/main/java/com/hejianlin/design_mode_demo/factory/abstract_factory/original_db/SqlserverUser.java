package com.hejianlin.design_mode_demo.factory.abstract_factory.original_db;

/**
 * 模拟Sqlserver对user的sql操作语句
 */
public class SqlserverUser {
    /**
     * 插入
     * @param user
     */
    public void insert(User user){
        System.out.println("Sqlserver：插入一条user记录");
    }

    /**
     * 查询
     * @param id
     * @return
     */
    public User select(int id){
        System.out.println("Sqlserver: 查询一条user记录");
        return null;
    }

}
