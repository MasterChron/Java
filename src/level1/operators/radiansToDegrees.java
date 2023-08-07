package level1.operators;

import java.util.Scanner;


public class radiansToDegrees {

    public void degrees(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello this programs aim to assist you in converting your radian value into degrees");
        System.out.println("\nPlease enter the value of your radian: ");

        double radian = scan.nextDouble();
        double degree = radian * 180 / Math.PI;
        System.out.println("Your degree value is: " + degree);
    }

    public static void main(String[] args) {
        radiansToDegrees obj = new radiansToDegrees();
        obj.degrees();
    }
}
