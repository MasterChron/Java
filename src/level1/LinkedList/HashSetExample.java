package level1.LinkedList;
import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<Double> num = new HashSet<>();
        num.add(0.123);
        num.add(0.124);
        num.add(0.123);
        //Rejects all duplicate values in HashSet
        System.out.println(num);
        //Similar to .get() but only checks if it stores a certain value
        System.out.println(num.contains(0.123));
        //Clears hash set
        num.clear();
    }
}
