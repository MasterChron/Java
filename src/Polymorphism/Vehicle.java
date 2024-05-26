package Polymorphism;

public class Vehicle{
    //defining a method
    void run(){System.out.println("Vehicle is running");}
}
//Creating a child class  
class Bike2 extends Vehicle{
    //defining the same method as in the parent class
    @Override
    void run(){System.out.println("Bike is running safely");}

    public static void main(String args[]){
        Vehicle obj1 = new Vehicle();
        Bike2 obj = new Bike2();//creating object
        obj1.run();
        obj.run();//calling method
    }
}