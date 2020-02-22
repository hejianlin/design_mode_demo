package com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.produce;

import com.hejianlin.design_mode_demo.factory.abstract_factory.original_db.Department;

public class SqlserverDepartment implements IDepartmentOperation{

    @Override
    public void insert(Department department) {
        System.out.println("Sqlserver：插入一条department记录");
    }

    @Override
    public Department select(int id) {
        System.out.println("Sqlserver：查询一条department记录");
        return null;
    }
}
