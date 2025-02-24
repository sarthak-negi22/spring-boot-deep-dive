package com.example.autowire.name;

public class Car {
//    bean name must be the same of the dependency name.
    private Specification specification;

    public void displayDetails() {
        System.out.println("Car Details:"+specification.toString());
    }

//    initilization of the bean will be done with the setter
    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

//    the setter function name should be taken accordingly as per the attribute name.
}


