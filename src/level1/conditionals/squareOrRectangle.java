package level1.conditionals;

import java.util.Scanner;

//Take values of length and width of a rectangle from the user and check if it is square or not.
public class squareOrRectangle {

    public void identification(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi this program aims to assist you in the identification of your shape either a square or not: ");
        System.out.println("\nPlease enter the value of the width of your shape: ");

        float side1 = scan.nextFloat();
        System.out.println("\nPlease enter the value of the length of your shape: ");

        float side2 = scan.nextFloat();
        if(side1 == side2) {
            System.out.println("Your shape is a square");
        }
        else {
            System.out.println("Your shape is a rectangle.");
        }
    }

    public static void main(String[] args) {
        squareOrRectangle obj = new squareOrRectangle();
        obj.identification();
    }
}
