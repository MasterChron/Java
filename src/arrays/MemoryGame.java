package arrays;

import java.util.Scanner;

public class MemoryGame {

    private static Scanner scanner = new Scanner(System.in);
    private static String[] arr = {"car", "toy", "pen", "feather", "cap", "chocolate", "charger", "bag", "paint", "mask"};


    public static void main(String[] args) throws InterruptedException {
        displayStart();
        displayOrder();
        int score = quiz();

        if (score >= 8){
            System.out.println("You have AWESOME MEMORY.");
        }
        else if(score >= 5){
            System.out.println("You have GOOD MEMORY.");
        }
        else{
            System.out.println("KEEP FOCUSING ON YOUR GOALS.");
        }
    }

    public static void displayStart() {
        System.out.println("**** CHECK YOUR MEMORY ****");
        System.out.println("The game will show you the list in an " +
                "\nordered term please remember" +
                "\norder of the items.");

        System.out.println("\n\t\tSCORING SYSTEM");
        System.out.println("If your score is > and == to 8 ---> AWESOME MEMORY");
        System.out.println("If score is > 5 and < 8 ---> GOOD MEMORY");
        System.out.println("If score < 5 ---> FOCUS on YOUR GOALS");

        System.out.println("TYPE IN ANYTHING TO START");
        scanner.next();
    }

    public static void displayOrder() throws InterruptedException {
       for (int i = 0; i < arr.length; i++){
           System.out.print((i + 1) + ") " + arr[i]);
           Thread.sleep(2000); //Gives user ability to see the words before they get erased
           System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b");
           System.out.print("");
       }

    }

    public static int quiz(){
        Scanner scan = new Scanner(System.in);
        int score = 0;

        //{"car", "toy", "pen", "feather", "cap", "chocolate", "charger", "bag", "paint", "mask"};
        System.out.println("Q1) What is the second item you viewed from the list?");
        score = answer(scan.nextLine(), arr[1], score);

        System.out.println("Q2) What is after the feather?");
        score = answer(scan.nextLine(), arr[4], score);

        System.out.println("Q3) What is the 6th element shown to you?");
        score = answer(scan.nextLine(), arr[5], score);

        System.out.println("Q4) What is the element in the list which is right before mask?");
        score = answer(scan.nextLine(), arr[arr.length - 2], score);

        System.out.println("Q5) What is the final element shown to you?");
        score = answer(scan.nextLine(), arr[arr.length - 1], score);

        System.out.println("Q6) What is the element which starts with the letter \'F\'");
        score = answer(scan.nextLine(), arr[3], score);

        System.out.println("Q7) What is the 7th element?");
        score = answer(scan.nextLine(), arr[6], score);

        System.out.println("Q8) What is the first element?");
        score = answer(scan.nextLine(), arr[0], score);

        return score;
    }

    public static int answer(String str, String correctAns, int score){
        if (str.equalsIgnoreCase(correctAns)) {
            System.out.println("Your answer was correct.");
            return score + 1;
        }
        else{
            System.out.println("Your answer was incorrect.");
            return score;
        }
    }
}
