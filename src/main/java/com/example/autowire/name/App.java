package com.example.autowire.name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

//        firstly, the config file is looked up
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireByName.xml");

        Car myCar = (Car) context.getBean("myCar");
        myCar.displayDetails();
    }
}


//  dependency injection happens with the help of setter in case of name autowiring. If no setter function is provided, error happens (NullPointerException)

