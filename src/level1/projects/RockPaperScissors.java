package level1.projects;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    //Method Question defined to ask user if they want to quit and has a return type of boolean
    public static boolean question() {
        //Initializes variables
        boolean quit = false;
        //Makes Scanner object
        Scanner scan = new Scanner(System.in);
        //Initializes String variable
        String ans;
        //Asks user if they want to quit and scans their answer
        System.out.println("If you wish to quit, type 'yes'. If you wish to continue, type anything.");
        ans = scan.nextLine();
        //If condition to check if the ans (scan.nextLine() or user Input is yes) and if it is it will make quit true
        if (ans.equalsIgnoreCase("yes")) {
            quit = true;
        }
        //returns quit (false if user typed anything but yes and yes if user typed in "yes")
        return quit;
    }

    //Creating a method to keep add score to playerScore here we only increase by one
    public static int incrementIncreaseByOne(int playerScore){
        return playerScore++;
    }
    //Creating another method this time to increase value by 2 or this value can be changed by however much you want the score to increase
    // once the computer or player wins
    public static int incrementIncreasesByTwo(int playerScore){
        playerScore += 2;
        return playerScore;
    }
    //Method used to generate a number between 0 --> 2 and has a return type of int
    public static int computerMove() {
        //Initalizes variable computer of type int
        int computer;
        //Creates Random Object
        Random random = new Random();
        //assigns computer value to the random value generated
        computer = random.ints(2, 0, 2).sum();
        //returns the generated number
        return computer;
    }
    //Creates a method used to decide the PlayerMove through userInput
    public static int playerMove() {
        //Makes playerChoice 0 by defualt
        int playerChoice = 0;
        //Creates Scanner object
        Scanner scan = new Scanner(System.in);
        //Uses try just in case our user enters String, or characters.
            try {
                //Asks user to type 0, 1, or 2 and to choose Rock, Paper, Or Scissors
                    System.out.println("Rock, Paper or Scissors.");
                    System.out.println("0 = Rock\n1 = Paper\n2 = Scissors");
                    //Assigns playerChoice to the scanned values
                    playerChoice = scan.nextInt();
                    scan.nextLine();
                    //If the player choice is not 0, 1, or 2 (choice being more than 2 or less than 0) then enters while loop
                    if (playerChoice > 2 || playerChoice < 0) {
                        //While loop conditions stay until playerChoice values is 0, 1, or 2.
                        while(playerChoice > 2 || playerChoice < 0) {
                            System.out.println("\nPlease enter a number that is either 0 , 1, or 2.\n");
                            System.out.println("Rock, Paper or Scissors.");
                            System.out.println("0 = Rock\n1 = Paper\n2 = Scissors");
                            //Scans playerChoice again to change value when the user enters hopefully the correct input
                            playerChoice = scan.nextInt();
                            scan.nextLine();
                        }
                    }
                    //Catches the try statement Exceptions I have used InputMismatdchException being putting a String or charchter value into the
                    //Scan.nextInt(); which would give us this error so this just catches the error and resends it to the try statement
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number.");
                scan.nextLine();
                //Catches any other exceptions that are to occur
            } catch (Exception e) {
                System.out.println("\nAn unexpected error occurred. Please try again\n.");
                scan.nextLine();
            }
            //Returns the PlayerChoice to be used in RockPaperScissors
        return playerChoice;
    }
    //Creates the method where game is played by taking in the playerChoice, computer(computerChoice), computerScore, playerScore, and NumOfRounds played
    //Has return type int[] to send multiple values (playerChoice, computer(computerChoice), computerScore, playerScore, and NumOfRounds) back
    //and use them to show our user the scores between the computer and player
    public static int[] rockPaperScissors(int playerChoice, int computer, int playerScore, int computerScore, int numOfRounds) {
        //If and many Else If statements used to decide who wins which match and if tied scores increase by 1 and win score Increase by 2
        if (playerChoice == computer) {
            System.out.println("You and the computer have tied.");
            playerScore += incrementIncreaseByOne(playerScore);
            computerScore += incrementIncreaseByOne(computerScore);
        } else if (playerChoice == 0 && computer == 1) {
            //playerChoice = "Rock"; computeMove = "Paper"
            System.out.println("The computer won by choosing Paper.");
            computerScore += incrementIncreasesByTwo(computerScore);
        } else if (playerChoice == 1 && computer == 0) {
            //playerChoice = "Paper"; computerMove = "Rock"
            System.out.println("You won by choosing Paper.");
            playerScore += incrementIncreasesByTwo(playerScore);
        } else if (playerChoice == 1 && computer == 2) {
            //playerChoice = "Paper"; computerMove = "Scissors"
            System.out.println("The computer won by choosing Scissors.");
            computerScore += incrementIncreasesByTwo(computerScore);
        } else if (playerChoice == 2 && computer == 1) {
            //playerChoice = "Scissors"; computerMove = "Paper"
            System.out.println("You won by choosing Scissors.");
            playerScore += incrementIncreasesByTwo(playerScore);
        } else if (playerChoice == 2 && computer == 0) {
            //playerChoice = "Scissors"; computerMove = "Rock"
            System.out.println("The computer won by choosing Rock.");
            computerScore += incrementIncreasesByTwo(computerScore);
        } else if (playerChoice == 0 && computer == 2) {
            //playerChoice = "Rock"; computerMove = "Scissors"
            System.out.println("You won by choosing Rock.");
            playerScore +=incrementIncreasesByTwo(playerScore);
        } else if (playerChoice > 2 || playerChoice < 0) {
            //playerChoice is more than less than 0 or more than 2 which is an invalid response;
            System.out.println("Please enter 0, 1, or 2.");
        }
        //Increases the numOfRounds played.
        numOfRounds++;
        //Returns an int[] array with the playerScore, computerScore, and numOfRounds
        return new int[]{playerScore, computerScore, numOfRounds};
    }

    //EndScores method used to display the scores and takes in the int[] array
    //computerScore, playerScore, and NumOfRounds)
    // from last time.
    public static void endScores(int[] a) {

        //Creates and stores the value of computerScore, playerScore, and NumOfRounds

        int playerScore = a[0];
        int computerScore = a[1];
        int numOfRounds = a[2];

        //Prints the score and the difference in the if statement section
        System.out.println("\nCurrent Score for Rock/Paper/Scissors: \nPlayer Score: " + playerScore + "\nComputer Score: " + computerScore + "\n");
        System.out.println("In " + numOfRounds + " rounds.\nThe final score for Player: " + playerScore + "\nFinal score for Computer: " + computerScore);
        if (playerScore > computerScore) {
            System.out.println("\nYou have won against the computer having a lead of " + (playerScore - computerScore) + " Points");
        } else if (playerScore < computerScore) {
            System.out.println("\nYou have lost against the computer having a lead of " + (computerScore - playerScore) + " Points");
        } else {
            System.out.println("\nYou and the computer have tied.");
        }
        System.out.println("\nSystem Powering Down.");
    }

    //Our Main Method where all our methods are called to play the game
    public static void main(String[] args) {
        //Initialization of variables
        int numOfRounds = 0;
        int playerScore = 0;
        int computerScore = 0;
        int[] scores = {0,0,0};
        boolean quit = false;

        //While the condition is met it will continue to run
        while (!quit) {
                //Uses question() method to ask the question to quit and returns the boolean to be used to check
                //our while loop conditions
                quit = question();
                //both playerChoice and computerChoice is being given values here
                int playerChoice = playerMove();
                int computer = computerMove();
                //Stores the values in our int[] scores array
                scores = rockPaperScissors(playerChoice, computer, playerScore, computerScore, numOfRounds);
                //Stores value to be used again in rockPaperScissors so the scores update and do not start back at score = 0
                playerScore = scores[0];
                computerScore = scores[1];
                numOfRounds = scores[2];
        }
        //Displays the endScores through endScores method when our while loop condition is no longer met.
        endScores(scores);
    }
}