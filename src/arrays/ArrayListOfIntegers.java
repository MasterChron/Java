package arrays;

import Polymorphism.A;
import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;

public class ArrayListOfIntegers {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);

        System.out.println("Array: " + arr);
    }
}
