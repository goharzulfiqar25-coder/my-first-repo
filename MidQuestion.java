class Vehicle {  //Zulfiqar Gauhar Sap id 76579
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void start() { //Zulfiqar Gauhar Sap id 76579
        System.out.println("Vehicle starting...");
    }

    public void stop() {
        System.out.println("Vehicle stopping...");
    }
}

class Car extends Vehicle { //Zulfiqar Gauhar Sap id 76579
    private int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    @Override
    public void start() { //Zulfiqar Gauhar Sap id 76579
        super.start(); 
        System.out.println("Car starting...");
    }

    public void playMusic() {
        System.out.println("Playing music in the car...");
    }
}

class Truck extends Vehicle { //Zulfiqar Gauhar Sap id 76579
    private double cargoCapacity; 

    public Truck(String make, String model, int year, double cargoCapacity) {
        super(make, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    public void haulCargo() { //Zulfiqar Gauhar Sap id 76579
        System.out.println("Hauling " + cargoCapacity + " pounds of cargo...");
    }
}

public class MidQuestion {
    public static void main(String[] args) {

        // Create a Car object Zulfiqar Gauhar Sap id 76579
        Car car = new Car("Toyota", "Camry", 2022, 4);
        car.start();
        car.playMusic();
        car.stop();

        System.out.println();

        // Create a Truck object  Zulfiqar Gauhar Sap id 76579
        Truck truck = new Truck("Ford", "F-150", 2021, 2000);
        truck.start();
        truck.haulCargo();
        truck.stop();
    }
}
