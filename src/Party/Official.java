package Party;

import java.util.Scanner;

public class Official extends Guest{

    String name;
    long phone_num;
    String designation;

    public Official(){
        super();
    }


    @Override
    public void inputDetails(){
        super.inputDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your designation?");
        this.designation = scanner.nextLine();
    }

    @Override
    public String displayInfo(){
        return super.displayInfo() + "\n{" +
                "Designation= '" +  this.designation
                + "}";
    }

    public static void main(String[] args) {
        Official of = new Official();
        System.out.println(of.displayInfo());
    }
}
