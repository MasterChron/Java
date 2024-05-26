package arrays;

import java.util.*;

public class ArrayListContacts {
    private static ArrayList<String> contacts = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        while (!quit) {
            int choice = choice();
            if (choice == 1) {
                addContact();
            } else if (choice == 2) {
                removeContact();
            } else if (choice == 3) {
                editContact();
            } else if (choice == 4) {
                displayContacts();
            } else if (choice == 5) {
                quit = true;
            } else {
                System.out.println("Invalid choice. Please choose a number between 1 and 5.");
            }
        }
        scan.close();
    }

    public static void addContact() {
        String name = addContactInfo();
        int number = addNumber();
        contacts.add(name + ": " + number);
        System.out.println("Contact added.");
    }

    public static void removeContact() {
        displayContacts();
        System.out.println("Enter the number of the contact to remove:");
        int index = scan.nextInt() - 1;
        scan.nextLine();  // consume leftover newline
        if (index >= 0 && index < contacts.size()) {
            contacts.remove(index);
            System.out.println("Contact removed.");
        } else {
            System.out.println("Invalid contact number.");
        }
    }

    public static void editContact() {
        displayContacts();
        System.out.println("Enter the number of the contact to edit:");
        int index = scan.nextInt() - 1;
        scan.nextLine();  // consume leftover newline
        if (index >= 0 && index < contacts.size()) {
            System.out.println("Enter edited contact's name:");
            String newName = scan.nextLine();
            System.out.println("Enter edited contact's number:");
            int newNumber = scan.nextInt();
            contacts.set(index, newName + ": " + newNumber);
            System.out.println("Contact updated.");
        } else {
            System.out.println("Invalid contact number.");
        }
    }

    public static void displayContacts() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i+1) + ") " + contacts.get(i) + "\n");
        }
    }

    public static int addNumber(){
        System.out.println("Please enter the number you wish to add into your contacts list (e.g. 1234567890): ");
        int number = 0;
        while (true) {
            try {
                number = Integer.parseInt(scan.nextLine());
                break;
            }
            catch (Exception e){
                System.out.println("This number contains illegal characters please try again with proper numbers.");
                scan.next();
            }
        }
        return number;
    }

    public static String addContactInfo(){
        System.out.println("Please enter the person's name who you'd like to add.");
        return scan.nextLine();
    }

    public static int choice(){
        System.out.println("1) add new contact\n2) remove a contact\n3) edit a contact\n4) Display contacts\n5) Quit");
        int choice  = 0;
        while (true) {
            try {
                choice = scan.nextInt();
                scan.nextLine();  // consume leftover newline
                break;
            }
            catch (Exception e){
                System.out.println("Please enter a valid choice");
                scan.next();
            }
        }
        return choice;
    }
}
