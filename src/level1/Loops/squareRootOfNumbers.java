package level1.Loops;

import java.util.Scanner;

public class squareRootOfNumbers {

    public void squareRt() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello please enter a number: ");
        int limit = scan.nextInt();

        for (int i = 1; i <= limit; i++) {
            System.out.println(Math.sqrt(i));
        }
    }
    //Write a program to print the square of all the numbers from 1 to the given number.
    public static void main(String[] args) {
        squareRootOfNumbers obj = new squareRootOfNumbers();
        obj.squareRt();
    }
}
