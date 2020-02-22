package com.hejianlin.design_mode_demo.factory.abstract_factory.access_db;

import com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.factory.IFactory;
import com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.factory.OracleFactory;
import com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.factory.SqlserverFactory;

public class DataAccess {
    private static final String database = "oracle";
    public static IFactory createFactory(){
        IFactory factory =null;
        switch (database){
            case "sqlserver":
                factory = new SqlserverFactory();
                break;
            case "oracle":
                factory = new OracleFactory();
                break;
            default:
                throw new RuntimeException("数据库配置异常！");
        }

        return factory;
    }
}
