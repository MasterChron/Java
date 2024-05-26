package ParkingLot;

import java.util.ArrayList;

public class GenericPrinter extends Thread{


        static int amount = 0;
    public static void main(String[] args) {
       ArrayList<String> arrayList = new ArrayList<>();
       arrayList.add("a");
       arrayList.add("b");
       arrayList.add("c");
       arrayList.forEach(System.out::println);
    }
    public void run() {
        amount++;
    }
}
