package level1.projects;

import java.util.Scanner;

public class NumberGuessingGame {
    public static int numberOfTries(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many tries would you like in this game?");
        return scan.nextInt();
    }
    public static void introduction(int tries){
        System.out.println("In this game you will be given " + tries + " number of tries in order to guess a randomly generated number.\n");
    }

    public static int randomNumber(){
        return (int)(100 * Math.random()) + 1;
    }

    public static int playerGuess(int tries) {
        Scanner scan = new Scanner(System.in);
        if (tries > 0) {
            System.out.println("You have " + tries + " tries remaining.");
            System.out.println("What is your guess on the random number?");
            return scan.nextInt();
        }
        else{
            return Integer.MAX_VALUE;
        }
    }
    public static boolean guess(int playerGuess, int randomNumber, int tries){
        boolean correctGuess = false;
        if(tries == 0){
            System.out.println("You have ran out of guesses and lost the game.");
            System.out.println("The correct answer is " + randomNumber + ".");
            correctGuess = true;
        }
        else if(playerGuess < randomNumber){
            System.out.println("Your guess " + playerGuess + " is too low.");
        }
        else if (playerGuess > randomNumber){
            System.out.println("Your guess " + playerGuess + " is too high.");
        }
        else {
            System.out.println("Your guess " + playerGuess + " is the correct randomly generated number.");
            correctGuess = true;
        }
        return correctGuess;
    }

    public static void main(String[] args) {
        boolean correctGuess = false;
        int randomNumber = randomNumber();
        int playerGuess;
        int tries = numberOfTries();
        introduction(tries);
        while(!(correctGuess)){
            playerGuess = playerGuess(tries);
            correctGuess = guess(playerGuess, randomNumber, tries);
            tries--;
        }
    }
}
