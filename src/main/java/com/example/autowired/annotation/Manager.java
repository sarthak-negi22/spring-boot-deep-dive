package com.example.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager {

    @Autowired  // this if filed injection, these will inject the values on Employee.

    @Qualifier("employee")          // used to resolve ambiguity when multiple beans of the same type exist, works alongside with @Autowired to specify which bean should be injected.
    private Employee employee;

    //@Autowired              // spring automatically injects the bean of type Employee as Manager is dependent on Employee. This is similar to constructor injection. If we remove the constructor, no error will occur BUT the values wont be initialized.

//    public Manager(Employee employee) {
//        this.employee = employee;
//    }

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
