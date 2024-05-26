package arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CreateAnArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = 0;
        while (true) {
            try {
                System.out.println("Please enter the size of your array: ");
                size = scanner.nextInt();
                break;
            }
            catch (Exception e){
                System.out.println("That is not a number please enter a number.");
                scanner.next();
            }
        }

        int number = 0;
        int[] arr = new int[size];
        System.out.println("Please enter your " + size + " numbers for your array.");

        for (int i = 0; i< arr.length; i++){
            while (true) {
                try {
                    System.out.println("Number at index " + (i + 1) + " is: ");
                    number = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("That is not a number please enter a number.");
                    scanner.next();
                }
            }
            arr[i] = number;
        }
        System.out.println(Arrays.toString(arr));
    }
}
