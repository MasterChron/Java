package Party;

import java.util.ArrayList;
import java.util.Scanner;

public class Party {

    static ArrayList<Family> familyGuests = new ArrayList<>();
    static ArrayList<Official> officialGuest = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Party p = new Party();
        p.addNewGuest();
    }

    public void addNewGuest() {
        while (true) {
            System.out.println("Would you like to add a new guest? (yes/no)");
            String ans = scanner.nextLine();

            if (ans.equalsIgnoreCase("yes")){
                System.out.println("Would you like to add a family member or official member?");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("family")){
                    addNewFamily();
                }
                else if(choice.equalsIgnoreCase("official")){
                    addNewOfficial();
                }
                else{
                    System.out.println("Not an option returning to menu.\n\n");
                }
            }
            else{
                displayInfo();
                break;
            }
        }

    }


    public void addNewFamily(){
        familyGuests.add(new Family());
    }

    public void addNewOfficial(){
        officialGuest.add(new Official());
    }

    public void displayInfo(){
        for (Family familyGuest : familyGuests) {
            System.out.println(familyGuest.displayInfo());
        }
        for (Official official : officialGuest) {
            System.out.println(official.displayInfo());
        }
    }
}
