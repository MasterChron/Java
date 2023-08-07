package level1.strings;

import java.util.Arrays;

public class Anagrams {
    //You are given two lowercase strings A and B each of length N. Return 1 if they are anagrams to each other and 0 if not

    public static int anagrams(String string1, String string2){
        char[] a = string1.toCharArray();
        char[] b = string2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        int i = anagrams("maker","rmake");
        System.out.println(i);
    }
}
