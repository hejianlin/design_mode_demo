package com.hejianlin.design_mode_demo.factory.abstract_factory.access_config_db;

import com.hejianlin.design_mode_demo.factory.abstract_factory.abstract_db.factory.IFactory;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 取得配置文件中的配置，并通过反射的方式，实例化数据库工厂
 * 由于这里使用了Spring的注解获取配置，所以这里需要使用@Component将DataAccess声明为Spring容器的一个bean
 */
@Component
@Data
public class DataAccess {

    @Value("${db_type.package}")
    private String parentDir;

    @Value("${db_type.factory}")
    private String factoryClass;


    public IFactory createFactory(){
        IFactory factory= null;

        try {
            Class<?> cls = Class.forName(parentDir+"."+factoryClass);
            factory=(IFactory)cls.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        if(factory==null){
            throw new RuntimeException("初始化数据库配置失败！");
        }
        return factory;
    }

}
