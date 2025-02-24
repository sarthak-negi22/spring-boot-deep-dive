package car.example.constructor.injection;

import car.example.bean.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConstructorInjection.xml");

        Car myCar = (Car) context.getBean("myCar");
        myCar.displayDetails();
    }
}

//  Dependencies are provided to the dependent class through its constructor

//  dependencies are passed as arguments to the constructor when the dependent class is instantiated

//  constructor injection ensures that the dependencies are available when the object is created