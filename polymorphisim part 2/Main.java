
// public class Car extends Vehicle { private int numDoors; public Car(String make, String model,
//  int year, int numDoors) { super(make, model, year); this.numDoors = numDoors; } 
// public void drive() { System.out.println("Driving car..."); } public int getNumDoors()
//  { return numDoors; } } public class Truck extends Vehicle { private int payloadCapacity;
//  public Truck(String make, String model, int year, int payloadCapacity)
//  { super(make, model, year); this.payloadCapacity = payloadCapacity; } public void drive() 
// { System.out.println("Driving truck..."); } public int getPayloadCapacity()
//  { return payloadCapacity; } } a) Identify an example of inheritance in the 
// code above and explain how it works. b) Identify an example of polymorphism in the code 
// above and explain how it works. c) What is the advantage of using abstract classes in this
//  class hierarchy?
abstract class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Abstract method (runtime polymorphism)
    public abstract void drive();
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    @Override
    public void drive() {
        System.out.println("Driving car...");
    }

    public int getNumDoors() {
        return numDoors;
    }
}

class Truck extends Vehicle {
    private int payloadCapacity;

    public Truck(String make, String model, int year, int payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void drive() {
        System.out.println("Driving truck...");
    }

    public int getPayloadCapacity() {
        return payloadCapacity;
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 2023, 4);
        Vehicle truck = new Truck("Ford", "F-150", 2023, 2000);

        car.drive();
        truck.drive();
    }
}