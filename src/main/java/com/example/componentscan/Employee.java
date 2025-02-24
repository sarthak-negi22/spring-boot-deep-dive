package com.example.componentscan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// this annotation marks the entire class as Spring bean, which can gets registered in the application context
// we can also specify the name of the bean to which it needs to be registered. By default, it registers as the same name of the class name (but first letter is small).
// @Component("employee")
@Component
public class Employee {
    private int employeeId;

    @Value("Hello")             // used to inject default values into the bean
    private String firstName;

    @Value("${java.home}")              // we can also use system properties like this
    private String lastName;

    @Value("#{4*4}")                // can also add mathematical computations like this
    private double salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
