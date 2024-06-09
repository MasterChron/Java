package mySql;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GuiOfStudents {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Integer> stdID = new ArrayList<>(), grade = new ArrayList<>();
    static ArrayList<Double> math = new ArrayList<>(), english = new ArrayList<>(), science = new ArrayList<>(), computer = new ArrayList<>();

    public static void addToDataBase(){
        ask("stdID");
        stdID.add(returnInt("stdID"));
        ask("grade");
        grade.add(returnInt("grade"));
        ask("math");
        math.add(returnDouble("math"));
        ask("english");
        english.add(returnDouble("english"));
        ask("science");
        science.add(returnDouble("science"));
        ask("computer");
        computer.add(returnDouble("computer"));
    }
    public static void ask(String type){
        System.out.println("What is the " + type + " of the student: ");
    }

    public static int returnInt(String type){
        int value;
        while (true) {
            try {
                value = scanner.nextInt();
                break;
            }
            catch (InputMismatchException e){
                System.out.println("error: " + e);
                System.out.println("Not correct value of: " +  type + " given.");
            }
        }
        return value;
    }

    public static double returnDouble(String type){
        double value;
        while (true) {
            try {
                value = scanner.nextDouble();
                break;
            }
            catch (InputMismatchException e){
                System.out.println("error: " + e);
                System.out.println("Not correct value of: " +  type + " given.");
            }
        }
        return value;
    }

    public static int findResults(int studentID){
        try {
            for (int i = 0; i < stdID.size(); i++){
                if (stdID.get(i) == studentID)
                    return i;
            }
        }
        catch (InputMismatchException e){
            System.out.println("error: " + e);
        }
        return -1;
    }

    public static void display(int index){
        if (index == -1) {
            System.out.println("Student not found");
            return;
        }
        try {
            System.out.println("Student ID: " + stdID.get(index));
            Thread.sleep(1000);
            System.out.println("Grade: " + grade.get(index));
            Thread.sleep(1000);
            System.out.println("Math: " + math.get(index));
            Thread.sleep(1000);
            System.out.println("English: " + english.get(index));
            Thread.sleep(1000);
            System.out.println("Science: " + science.get(index));
            Thread.sleep(1000);
            System.out.println("Computer: " + computer.get(index));
        }
         catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void fetchResults(){
        System.out.println("What is the id of your student: ");
        display(findResults(returnInt("id")));
    }

    public static void choices(){
        while (true){
            System.out.println("\n1) Add to database\n2) Find student\n3) Exit system");
            switch (returnInt("choice")){
                case 1:
                    addToDataBase();
                    break;
                case 2:
                    fetchResults();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }


    public static void main(String[] args) {
        choices();
    }
}
