package level1.projects;

import java.util.Arrays;
import java.util.Scanner;

public class QuizzingSystem {

    public static int answer(String str, String correctAns,int score){
        if (str.equalsIgnoreCase(correctAns)) {
            System.out.println("Your answer was correct");
            return score + 1;
        }
        else{
            System.out.println("Your answer was incorrect.");
            return score;
        }
    }

    public static String ask(String a, String b, String c, String d){
        Scanner scan = new Scanner(System.in);
        String str;
        while(true){
            System.out.println("A) " + a);
            System.out.println("B) " + b);
            System.out.println("C) " + c);
            System.out.println("D) " + d);
            System.out.println("Please choose one of the options shown above such as\nA, B, C or D.");
            str = scan.nextLine();
            if(str.equalsIgnoreCase("a") || str.equalsIgnoreCase("b") || str.equalsIgnoreCase("c") || str.equalsIgnoreCase("d")){
                break;
            }
            System.out.println("\nPlease choose one of the options above.");
        }

        return str;
    }

    public static int trueQuiz(int[] questions, int score) {
        for(int i = 0;i < questions.length; i++) {
            int questionsQ = questions[i];
            score = quiz(questionsQ, score);
        }
        return score;
    }

    public static int[] questionRandomizer() {
        int[] a = new int[10];
        a[0] = (int) (Math.random() * 21);

        for (int i = 1; i < a.length; i++) {
            a[i] = (int) (Math.random() * 20);
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    i--;
                    break;
                }
            }
        }

        return a;
    }
    public static int quiz(int a, int score) {

        String str;
        //Question 1
        if (a == 0) {
            System.out.println("\nQuestion: Which of these colours is not in a rainbow?");
            str = ask("red","green","orange","black");
            score = answer(str,"d", score);
        }
        //Question 2
        else if (a == 1) {
            System.out.println("\nQuestion: Which of these numbers do not follow the pattern ---> (1, 2, 3, 4)");
            str = ask("1","2","3","8");
            score = answer(str,"d", score);
        }
        //Question 3
        else if (a == 2) {
            System.out.println("\nQuestion: What colour is the sky");
            str = ask("Blue", "Red", "Green", "White");
            score = answer(str,"a", score);
        }
        //Question 4
        else if (a == 3) {
            System.out.println("\nQuestion: Which of these data types are non-primitive");
            str = ask("boolean","int","String","char");
            score = answer(str,"c", score);
        }
        //Question 5
        else if (a == 4) {
            System.out.println("\nQuestion: What is the capital of paris?");
            str = ask("Marseille","Paris","Lyon","Toulouse");
            score = answer(str,"b", score);
        }
        //Question 6
        else if (a == 5) {
            System.out.println("How many planets are there in our solar system?");
            str = ask("12","8","10","9");
            score = answer(str,"b", score);
        }
        //Question 7
        else if (a == 6) {
            System.out.println("Who wrote the famous play 'Romeo and Juliet'?");
            str = ask("Jonson","Cervantes","Marlowe","Shakespeare");
            score = answer(str,"d", score);
        }
        //Question 8
        else if (a == 7) {
            System.out.println("What is the chemical symbol for Gold?");
            str = ask("Au","G","Go","Na");
            score = answer(str,"a", score);
        }
        //Question 9
        else if (a == 8) {
            System.out.println("When was declaration of independence signed?");
            str = ask("1932","1869","1776","2023");
            score = answer(str,"c", score);
        } else if (a == 9) {
            System.out.println("What is the tallest mountain in the world?");
            str = ask("Lhotse","Kanchenjunga","K2","Mount Everest");
            score = answer(str,"d", score);
        } else if (a == 10) {
            System.out.println("How many continents are there on Earth?");
            str = ask("9","7","4","1");
            score = answer(str,"b", score);
        } else if (a == 11) {
            System.out.println("Which animal is the largest mammal on Earth?");
            str = ask("Blue Whale","Squirrel","Dog","Hippopotamus");
            score = answer(str,"a", score);
        } else if (a == 12) {
            System.out.println("What planet is known as the 'Red Planet'?");
            str = ask("Saturn","Venus","Mars","Jupiter");
            score = answer(str,"c", score);
        } else if (a == 13) {
            System.out.println("What of these is the score covalent bond for water?");
            str = ask("O2","H20","CO2","N2");
            score = answer(str,"b", score);
        } else if (a == 14) {
            System.out.println("Which famous scientist formulated the three laws of motion?");
            str = ask("Marie Curie","Sir Isaac Newton","Galileo Galilei","Albert Einstein");
            score = answer(str,"b", score);
        } else if (a == 15) {
            System.out.println("What is the capital city of Japan?");
            str = ask("Beijing","Bangkok","Tokyo","Seoul");
            score = answer(str,"c", score);
        } else if (a == 16) {
            System.out.println("Which planet in our solar system has the most moons?");
            str = ask("Jupiter","Saturn","Neptune","Mars");
            score = answer(str,"d", score);
        } else if (a ==17){
            System.out.println("Which famous artist painted the 'Mona Lisa'?");
            str = ask("Michelangelo","Vincent van Gogh","Pablo Picasso","Leonardo da Vinci");
            score = answer(str,"d", score);
        }
        else if (a == 18) {
            System.out.println("In which country was the sport of basketball invented?");
            str = ask("Canada","United States of America","France","England");
            score = answer(str,"a", score);
        }
        else {
            System.out.println("Who is the author of the 'Harry Potter book series?'");
            str = ask("J.R.R. Tolkien","C.S. Lewis","J.K. Rowling","George R.R. Martin");
            score = answer(str,"c", score);
        }
        return score;
    }

    public static void main(String[] args) {
        int[] questions;
        int scores = 0;
        questions = questionRandomizer();
        System.out.println(Arrays.toString(questions));
        scores = trueQuiz(questions,scores);
        System.out.println("You scored: " + scores + "/10");
    }
}


