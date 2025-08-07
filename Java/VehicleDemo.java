// package inheritance;
import java.util.*;
class Vehicle{
    int noOfPerson;
    String color;
    int cc;
    int noOfGears;
    double milage;
    String fuelType;
    double price;
    String modelName;
    int manufacture;
    int scrapeYear;
}
class Bike extends Vehicle{
    // int noOfPerson;
    // String color;
    // int cc;
    // int noOfGears;
    // double milage;
    // String fuelType;
    // double price;
    // String modelName;
    // int manufacture;
    boolean isMoped;
    String standType;
    boolean isKickStart;
}

class Car extends Vehicle{
    // int noOfPerson;
    // String color;
    // int cc;
    // int noOfGears;
    // double milage;
    // String fuelType;
    // double price;
    // String modelName;
    // int manufacture;
    int noOfAirbags=2;
    double acCapicity;
    boolean isPowerStearing;
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.noOfGears=6;
        System.out.println(audi.noOfAirbags);
        System.out.println(audi.noOfGears);
    }
}
