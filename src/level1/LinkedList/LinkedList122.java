package level1.LinkedList;

import java.util.*;

public class LinkedList122 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<String> colors = new LinkedList<String>();

        colors.add("blue");
        colors.add("green");
        colors.add("red");
        colors.add("yellow");
        ArrayList<String> dsa = new ArrayList<String>();
        LinkedList<String> fruits = new LinkedList<String>();


        for (int i = 0; i <= 3; i++){
            System.out.println("Tell me some fruits.");
            String name = scan.nextLine();
            fruits.add(name);
        }
        System.out.println(colors.get(2));
    }
}
