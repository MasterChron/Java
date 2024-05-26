package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class TopicRevision {

    static Stack<Character> stack = new Stack<>();

    public static void main(String[] args) {

        addToStack();
        choices();
    }

    public static void choices(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1) Show peak of list " + "\n2) Show full topic list" + "\n3) Exit program");

            switch (scanner.nextInt()) {

                case 1:
                    peakList();
                    break;
                case 2:
                    displayList();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

    public static void peakList(){
        System.out.println(stack.peek());
    }

    public static void displayList(){
        int initialCapacity = stack.size() - 1;

        for (int i = initialCapacity; i >= 0; i--){
            System.out.println(stack.get(i));
        }
    }

    public static void addToStack(){

        for (int i = 0; i < 25; i++){
            stack.push((char)(65 + i));
        }
    }
}
