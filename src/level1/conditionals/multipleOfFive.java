package level1.conditionals;

import java.util.Scanner;

public class multipleOfFive {

    public void multiple(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi this program aims to assist you in the identification of if your number is a multiple of 5: ");
        System.out.println("\nPlease enter the value of your number: ");

        float num = scan.nextFloat();
        if (num % 5 == 0) {
            System.out.println("Your number is a multiple of 5.");
        } else {
            System.out.println("Your number is not a multiple of 5.");
        }
    }

    public static void main(String[] args) {
        multipleOfFive obj = new multipleOfFive();

        obj.multiple();
    }
}
