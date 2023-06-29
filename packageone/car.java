package packageone;


// car, truck, motorbike, autorikshaw =>  
// public, private, protected, default;.
// inside the package, inside same class, outside package, children
 class vehicle{
    String name;
    int noofwheels;


    // Constructor 
    // default Constructor
    // parametarized constructor
    // setter methods
    public vehicle(){
        this.name = "car1";
        this.noofwheels = 4;
    }
    public vehicle( String name, int wheels){
        this.name = name;
        noofwheels = wheels;
    }

    // public void setName(String name){
    //     //this current object
    //     this.name = name;
    // }

    // public void setNoOfWheels (int wheels) {
    //     // this.noofwheels = wheels;
    //     noofwheels= wheels;
    // }


    // getter methods
    public String getName(){
        return this.name;
    }

    public int getNoOFWheels(){
        return noofwheels;
    }
 }
public class car{
     public static void main(String[] args) {

        vehicletwo vehicletw= new vehicletwo();
        // vehicletw.checkMethod();;
        // object of car; 

        vehicle car= new vehicle();
         System.out.println(car.getName());
        System.out.println(car.getNoOFWheels());

        // new constructor calls => same name vehicle ;




        // car.setName("CAr");
        // car.setNoOfWheels(4);
       

        vehicle cartwo  = new vehicle("cartwo", 4);
        System.out.println(cartwo.getName());
        System.out.println(cartwo.getNoOFWheels());
        // int a= 30;

        // object of truck

        // vehicle truck = new vehicle();
        // truck.setName("truck");
        // truck.setNoOfWheels(8);
        // System.out.println(truck.getName());
        // System.out.println(truck.getNoOFWheels());

        
    }
}
