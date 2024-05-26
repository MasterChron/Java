package Projects;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class KioskSystem {

    public static Scanner scanner = new Scanner(System.in);
    public ArrayList<String> items = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        KioskSystem obj = new KioskSystem();
        obj.choices();
    }

    public void choices() throws InterruptedException {
        while (true) {
            System.out.println("Would you like to: \n1) Open Kiosk to create a list of items?\n2) View a sorted List\n3) Exit Program");
            int ans = Integer.parseInt(scanner.nextLine());

            switch (ans){
                case 1:
                    get_list();
                    break;
                case 2:
                    sorted_list();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Not a number.\nPlease enter a number.");
            }
        }
    }

    public void get_list() {

        while (true) {
            System.out.println("Please write an item to add: ");
            items.add(scanner.nextLine());

            System.out.println("Would you like to continue adding items?\n(Yes / No)");
            String ans = scanner.nextLine();
            if (ans.equalsIgnoreCase("no")){
                return;
            }
        }
    }

    public void sorted_list() throws InterruptedException {
        sort();

        System.out.println("List of items: ");
        for (String str : items){
            System.out.println(str);
        }
        Thread.sleep(2000);
        System.out.println();
    }

    public void sort() {
        int n = items.size();
        boolean swapped;
        for (int k = 0; k < n - 1; k++) {
            for (int i = 0; i < n - k - 1; i++) {
                swapped = false;
                if (items.get(i).length() >= items.get(i + 1).length()) {
                    String temp = items.get(i);
                    items.set(i, items.get(i + 1));
                    items.set(i + 1, temp);
                    swapped = true;
                }
                if (!swapped) {
                    return;
                }
            }
        }
    }
}