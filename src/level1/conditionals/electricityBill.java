package level1.conditionals;

import java.util.Scanner;

public class electricityBill {

    //Write a program to calculate the electricity bill (accepts number of unit from user) according to the following criteria:
    //Unit                                                          Price
    //First 100 units                                             $ no charge
    //Next 100 units                                              $ 5 per unit
    //After 200 units                                             $ 10 per unit
    //(For example if input unit is 350 than total bill amount is $ 2000)

    public void bill(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi this program aims to assist you in calculating your electricity bill: ");
        System.out.println("\nPlease enter the value of your electricity unit: ");

        int num = scan.nextInt();
        int bill;

        if (num <= 100) {
            System.out.println("You are not charged for an electricity bill.");
        }
        else if (num > 100 && num <= 200) {
            bill = (num - 100) * 5;
            System.out.println("Your electricity bill is: " + bill);
        }
        else {
            bill = ((num - 200) * 10) + 500;
            System.out.println("Your electricity bill is: " + bill);
        }
    }

    public static void main(String[] args) {
        electricityBill obj = new electricityBill();
        obj.bill();
    }
}
