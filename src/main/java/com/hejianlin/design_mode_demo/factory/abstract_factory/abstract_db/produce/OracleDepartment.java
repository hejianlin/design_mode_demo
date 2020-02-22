package com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.produce;

import com.hejianlin.design_mode_demo.factory.abstract_factory.original_db.Department;

public class OracleDepartment implements IDepartmentOperation{

    @Override
    public void insert(Department department) {
        System.out.println("Oracle：插入一条department记录");
    }

    @Override
    public Department select(int id) {
        System.out.println("Oracle：查询一条department记录");
        return null;
    }
}
