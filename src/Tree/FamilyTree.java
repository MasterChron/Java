package Tree;

import java.util.Scanner;

public class FamilyTree {

    static Scanner scanner = new Scanner(System.in);

    String name;

    public FamilyTree childOne;
    public FamilyTree childTwo;
    public FamilyTree childThree;

    public FamilyTree(){
        childOne = null;
        childTwo = null;
        childThree = null;
    }

    void display(){
        System.out.println(name + "--");
    }

    void getTree(){
        question("grandfather");
        name = scanner.nextLine();

        question("Uncle");
        childOne.name = scanner.nextLine();

        question("father");
        childTwo.name = scanner.nextLine();

        question("Second Uncle");

     
    }

    void question(String x){
        System.out.println("What is the " + x + "'s name: ");
    }
}
