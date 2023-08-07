package level1.strings;

import java.util.Arrays;

public class ReverseAString2 {

//    Write a program to reverse the string.
//            Example - “Prab is a coder”
//    o/p - “coder a is Prab”
//
//
//    Example - “  Java  is   cool   “
//    o/p - “cool is Java”
//

    public static String reverseTheString(String str){
        String[] a = str.trim().split(" ");
        StringBuilder str2 = new StringBuilder();
        for(int i=a.length-1; i >= 0; i--) {
            if(a[i] == "") {
                continue;
            }
                str2.append(a[i] + " ");
        }
        return str2.toString();

    }

    public static void main(String[] args) {

        String str = " Java is an       amazing language ";
        System.out.println(reverseTheString(str));
    }
}
