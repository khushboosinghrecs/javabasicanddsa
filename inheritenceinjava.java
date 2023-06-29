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

// class Car2 extends Vehicle {
    
// //brand
//     private int numWheels;
//     public String brand;

//     public Car2(String brand, int numWheels) {
//         super(brand); // Calling superclass constructor
//         this.numWheels = numWheels;
//     }

//     @Override
//     public void drive() {
//         System.out.println("Driving the car");
//     }

//     drive();

//     public void honk() {
//         System.out.println("Honking the horn");
//     }
// }


public class inheritenceinjava {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Maruti sujuki");
        System.out.println(vehicle.brand);
        vehicle.drive();
        
        // System.out.println(vehicle.drive());

        Car car = new Car("Toyota", 4);

        System.out.println("Brand: " + car.brand); // Inherited member
        car.drive(); // Overridden method
        car.honk(); // Subclass-specific method
    }
    
}
