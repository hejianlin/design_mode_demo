package com.hejianlin.design_mode_demo.factory.abstract_factory.method_db.produce;

import com.hejianlin.design_mode_demo.factory.abstract_factory.original_db.User;

public interface IUserOperation {
    /**
     * 插入
     * @param user
     */
    void insert(User user);

    /**
     * 查找
     * @param id
     * @return
     */
    User select(int id);


}
