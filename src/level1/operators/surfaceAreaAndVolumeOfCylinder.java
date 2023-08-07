package level1.operators;

import java.util.Scanner;

public class surfaceAreaAndVolumeOfCylinder {

    public void surfaceAreaAndVolume() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello this programs aim to assist you in finding the surface area and volume of your cylinder.");
        System.out.println("\nPlease state the value of the radius of your cylinder: ");

        double radius = scan.nextDouble();
        System.out.println("\nPlease state the value of the height of your cylinder: ");

        double height = scan.nextDouble();
        double surfaceArea = (2 * Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * radius * height);
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("\nThe surface area of your cylinder is: " + surfaceArea);
        System.out.println("\nThe volume of your cylinder is: " + volume);
    }
    public static void main(String[] args) {
        surfaceAreaAndVolumeOfCylinder obj = new surfaceAreaAndVolumeOfCylinder();
        obj.surfaceAreaAndVolume();
    }
}
