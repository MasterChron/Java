package level1.projects;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static boolean question() {
        boolean quit = false;
        Scanner scan = new Scanner(System.in);
        String ans;
        System.out.println("If you wish to quit, type 'yes'. If you wish to continue, type anything.");
        ans = scan.nextLine();
        if (ans.equalsIgnoreCase("yes")) {
            quit = true;
        }
        return quit;
    }

    public static int incrementIncreaseByOne(int playerScore){
        return playerScore++;
    }

    public static int incrementIncreasesByTwo(int playerScore){
        playerScore += 2;
        return playerScore;
    }

    public static int computerMove() {
        int computer;
        Random random = new Random();
        computer = random.ints(2, 0, 2).sum();
        return computer;
    }

    public static int playerMove() {
        int playerChoice = 0;
        Scanner scan = new Scanner(System.in);
            try {
                    System.out.println("Rock, Paper or Scissors.");
                    System.out.println("0 = Rock\n1 = Paper\n2 = Scissors");
                    playerChoice = scan.nextInt();
                    scan.nextLine();
                    if (playerChoice > 2 || playerChoice < 0) {
                        while(playerChoice > 2 || playerChoice < 0) {
                            System.out.println("\nPlease enter a number that is either 0 , 1, or 2.\n");
                            System.out.println("Rock, Paper or Scissors.");
                            System.out.println("0 = Rock\n1 = Paper\n2 = Scissors");
                            playerChoice = scan.nextInt();
                            scan.nextLine();
                        }
                    }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number.");
                scan.nextLine();
            } catch (Exception e) {
                System.out.println("\nAn unexpected error occurred. Please try again\n.");
                scan.nextLine();
            }
        return playerChoice;
    }

    public static int[] rockPaperScissors(int playerChoice, int computer, int playerScore, int computerScore, int numOfRounds) {
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
        numOfRounds++;
        return new int[]{playerScore, computerScore, numOfRounds};
    }

    public static void endScores(int[] a) {

        int playerScore = a[0];
        int computerScore = a[1];
        int numOfRounds = a[2];

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

    public static void main(String[] args) {
        int numOfRounds = 0;
        int playerScore = 0;
        int computerScore = 0;
        int[] scores = {0,0,0};
        boolean quit = false;

        while (!quit) {
                quit = question();
                int playerChoice = playerMove();
                int computer = computerMove();
                scores = rockPaperScissors(playerChoice, computer, playerScore, computerScore, numOfRounds);
                playerScore = scores[0];
                computerScore = scores[1];
                numOfRounds = scores[2];
        }
        endScores(scores);
    }
}