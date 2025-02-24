package com.example.autowire.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

//        firstly, the config file is looked up
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireByType.xml");

        Car myCar = (Car) context.getBean("myCar");
        myCar.displayDetails();
    }
}


//  dependency injection happens with the help of setter in case of type autowiring. If no setter function is provided, error happens (NullPointerException)

