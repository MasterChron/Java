package Polymorphism;

import static Polymorphism.Calculations.addition;

public class Calculations {
    public static int addition(int a, int b, int c) {
        return a + b + c;
    }
    public static double addition(double a, double b, double c) {
        return a + b + c;
    }
}

class RunningCalculations{

    public static void main(String[] args) {
        System.out.println(addition(1,2,3));
        System.out.println(addition(1.1,2.2,3.3));
    }
}

