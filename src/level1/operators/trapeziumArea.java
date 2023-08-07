package level1.operators;

import java.util.Scanner;

public class trapeziumArea {

    public void area(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello this programs aim to assists you in finding the area of a trapezium: ");
        System.out.println("\nPlease enter the value of the first base of your trapezium: ");

        int base1 = scan.nextInt();
        System.out.println("\nPlease enter the value of the second base of your trapezium: ");

        int base2 = scan.nextInt();
        System.out.println("Please enter the value of the height of your trapezium: ");

        int height = scan.nextInt();
        int area = ((base1 + base2) / 2) * height;
        System.out.println("The area of your trapezium is: " + area);
    }

    public static void main(String[] args) {
        trapeziumArea obj = new trapeziumArea();
        obj.area();
    }
}
