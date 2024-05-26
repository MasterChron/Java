package level1.Loops;

import java.util.Scanner;

public class cubeOfAllNumbers {
    //Write a program to print the cube of all the numbers from 1 to the given number.

    public void cube(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello please enter a number: ");
        int limit = scan.nextInt();
        for(int i = 1; i <= limit; i++) {
            System.out.println(Math.pow(i, 3));
        }
    }

    public static void main(String[] args) {
        cubeOfAllNumbers obj = new cubeOfAllNumbers();
    }
}
