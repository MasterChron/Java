package level1.conditionals;

import java.util.Scanner;

public class evenOrOdd {

    public void evenOrOdd(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi this program aims to assist you in the identification of your number either an even number or odd number: ");
        System.out.println("\nPlease enter the value of your number: ");
        float num = scan.nextFloat();
        if ( num % 2 == 0) {
            System.out.println("Your number is an even number.");
        }
        else {
            System.out.println("Your number is an odd number.");
        }
    }

    public static void main(String[] args) {
        evenOrOdd obj = new evenOrOdd();
        obj.evenOrOdd();
    }
}
