package level1.methods;

import java.util.Scanner;

public class leapYear {

    public boolean leapYear(int year){
        return year % 4 == 0 && year % 100 == 0 || year % 400 == 0;
    }

    public static void main(String[] args) {
        leapYear obj = new leapYear();
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a year in and we will determine if it is a leap year or not.");
        int year = scan.nextInt();
        boolean leapYear = obj.leapYear(year);

        if (leapYear) {
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
