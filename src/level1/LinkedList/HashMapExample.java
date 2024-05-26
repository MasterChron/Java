package level1.LinkedList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> num = new HashMap<String, Integer>();
        num.put("abc", 67);
        num.put("def", 90);
        num.put("ghi", 21);
        num.remove("abc");
        System.out.println(num);
        System.out.println(num.get("def"));
        //Clears the whole HashMap
        num.clear();
        System.out.println(num);
    }
}
