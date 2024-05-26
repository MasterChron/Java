package arrays;

import java.util.ArrayList;

public class ArrayListItems {

    ArrayList<String> names = new ArrayList<>();

    public void addNames(String name){
    this.names.add(name);
    }

    public void getNames(){
        for (String n : names){
            System.out.println(n);
        }
    }

    public void findName(String name){
        for (String n : names){
            if (n.equals(name)){
                System.out.println("Name: " + n + " found.");
                return;
            }
        }
        System.out.println("No " + name + " found.");
    }

    public static void main(String[] args) {
        ArrayListItems a = new ArrayListItems();
        a.addNames("John");
        a.addNames("David");
        a.addNames("Brad");

        a.getNames();

        a.findName("John");
        a.findName("Kevin");

    }
}
