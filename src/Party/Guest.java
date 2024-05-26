package Party;

import java.util.Scanner;

public class Guest {

    String name;
    String phone_num;

    public Guest(){
        inputDetails();
    }

    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Phone Number format should be something like this --> (1-234-567-8910)");
        System.out.println("\nEnter your Phone Number: ");
        phone_num = scanner.nextLine();
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
    }

    public String displayInfo() {
        return "Guest{" +
                "name= '" + name + '\'' +
                ", phone_num= '" + phone_num + '\'' +
                '}';
    }
}
