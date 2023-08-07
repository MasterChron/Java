package level1.operators;

import java.util.Scanner;

public class degreesToRadians {

    public void radians() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello this programs aim to assist you in converting your degree value into radians");
        System.out.println("\nPlease enter the value of your degree: ");
        double degree = scan.nextDouble();
        double radian = degree * Math.PI / 180;
        System.out.println("Your degree value is: " + radian);
    }
    public static void main(String[] args) {
        degreesToRadians obj = new degreesToRadians();
        obj.radians();
    }
}
