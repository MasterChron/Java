package level1.conditionals;

import java.util.Scanner;

public class greaterNumber {

    public void greatestNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi this program aims to assist you in the identification of which of your two numbers is positive: ");
        System.out.println("\nPlease enter the value of your first number: ");

        float num = scan.nextFloat();
        System.out.println("\nPlease enter the value of your second number: ");

        float num2 = scan.nextFloat();
        if ( num > num2 ) {
            System.out.println("The number: " + num + " is greater than: " + num2);
        }
        else {
            System.out.println("The number: " + num2 + " is greater than: " + num);
        }
    }

    public static void main(String[] args) {
        greaterNumber obj = new greaterNumber();
        obj.greatestNumber();
    }
}
