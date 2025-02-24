package car.example.setter.injection;

public class Car {
//    stimulating the scenario of tight coupling, Car is dependent on Specification
    private Specification specification;

    public void displayDetails() {
        System.out.println("Car Details:"+specification.toString());
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }
}
