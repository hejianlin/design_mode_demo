package com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.produce;

import com.hejianlin.design_mode_demo.factory.abstract_factory.original_db.Department;
import com.hejianlin.design_mode_demo.factory.abstract_factory.original_db.User;

public interface IDepartmentOperation {

    /**
     * 插入
     * @param department
     */
    void insert(Department department);

    /**
     * 查找
     * @param id
     * @return
     */
    Department select(int id);


}
