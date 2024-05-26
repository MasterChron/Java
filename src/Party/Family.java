package Party;

import java.util.Scanner;

public class Family extends Guest{

    int num_of_members;
    static int total_guests = 0;

    public Family(){
        super();
        Family.total_guests += num_of_members;
    }


    @Override
    public void inputDetails(){
        super.inputDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the total number of family members with you right now?");
        this.num_of_members = scanner.nextInt();
    }

    @Override
    public String displayInfo(){
        return super.displayInfo() + "\n{" +
                "Number Of Family Members= '" +  this.num_of_members
                + '\'' + ", Total_Guests= '" + Family.total_guests + '\''
                + "}";
    }

    public static void main(String[] args) {
        Family family = new Family();
        Family family2 = new Family();
        System.out.println(family.displayInfo());
    }

}
