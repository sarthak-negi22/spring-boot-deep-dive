package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationInversionOfControl.xml");

//        here we arent instantiating the objects three times, we are just getting it from the bean directly

        UserManager userMangerWithDB = (UserManager) context.getBean("userManagerWithUserDatabaseProvider");
        System.out.println(userMangerWithDB.getUserInfo());

        UserManager userManagerWithNewDB = (UserManager) context.getBean("userManagerWithNewDatabaseProvider");
        System.out.println(userManagerWithNewDB.getUserInfo());

        UserManager userMangerWithWeb = (UserManager) context.getBean("userManagerWithWebServiceDataProvider");
        System.out.println(userMangerWithWeb.getUserInfo());
    }
}