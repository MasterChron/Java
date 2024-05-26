package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class PerformerList {

    static Stack<String> stack = new Stack<>();


    public static void main(String[] args) {
        testGuests();
        choices();
    }

    public static void choices(){
        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("1) Call your next guest" + "\n2) Number of guests remaining" + "\n3) Exit program");

            switch (scanner.nextInt()){
                case 1:
                    callGuest();
                    break;
                case 2:
                    numOfGuestRemaining();
                    break;
                case 3:
                    scanner.close();
                    System.exit(0);
            }
        }
    }

    public static void callGuest(){
        if (!stack.isEmpty())
            System.out.println("Current guest: " + stack.pop()  + " has preformed.");
        numOfGuestRemaining();
    }

    public static void numOfGuestRemaining(){
        if (!stack.isEmpty())
            System.out.println("Performers left: " + (stack.size() - 1));
        else
            System.out.println("No performers left...");
    }

    public static void testGuests(){
        for (int i = 0; i < 25; i++){
            char temp = (char) (65 + i);
            String temp1 = String.valueOf(temp);
            stack.push(temp1);
        }
    }
}
