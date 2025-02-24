package car.example.constructor.injection;

public class Car {
//    stimulating the scenario of tight coupling, where car is dependent on specification (Specification bean is needed by Car bean)

    private Specification specification;

    public void displayDetails() {
        System.out.println("Car Details:"+specification.toString());
    }

    public Car(Specification specification) {
        this.specification = specification;
    }
}
