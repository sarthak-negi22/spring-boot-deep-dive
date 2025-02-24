package com.example.autowire.constructor;

public class Car {
    private Specification specification;

    public void displayDetails() {
        System.out.println("Car Details:"+specification.toString());
    }

//    a constructor must be defined to inject the dependency, in case of autowiring by constructor. Spring matches up with the correct constructor parameter name.
    public Car(Specification specification) {
        this.specification = specification;
    }
//  no setter function is required here.
}


