package level1.conditionals;

import java.util.Scanner;

public class positiveNegativeOrZero {

    public void positiveNegativeZero() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi this program aims to assist you in the identification of your number either a positive number, negative number or zero: ");
        System.out.println("\nPlease enter the value of your number: ");

        float num = scan.nextFloat();

        if ( num > 0 ) {
            System.out.println("Your number is a positive number.");
        }
        else if ( num < 0 ) {
            System.out.println("Your number is a negative number.");
        }
        else {
            System.out.println("Your number is zero.");
        }
    }

    public static void main(String[] args) {
        positiveNegativeOrZero obj = new positiveNegativeOrZero();
        obj.positiveNegativeZero();
    }
}
