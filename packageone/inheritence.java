package packageone;
// Superclass
class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void drive() {
        System.out.println("Driving the vehicle");
    }
}


// Subclass
class Car extends Vehicle {
//brand
    private int numWheels;

    public Car(String brand, int numWheels) {
        super(brand); // Calling superclass constructor
        this.numWheels = numWheels;
    }

    @Override
    public void drive() {
        System.out.println("Driving the car");
    }

    public void honk() {
        System.out.println("Honking the horn");
    }
}

public class inheritence {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4);

        System.out.println("Brand: " + car.brand); // Inherited member
        car.drive(); // Overridden method
        car.honk(); // Subclass-specific method
    }
}