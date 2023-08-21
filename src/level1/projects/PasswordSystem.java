package level1.projects;

import java.util.Arrays;

public class PasswordSystem {

    //Create a java program to generate a password of 8 characters.
    //The password should have following mandatory features -
    //~ it should contain at least one uppercase character
    //~ it should contain at least one lowercase character
    //~ it should contain at least one special character
    //~ it should contain at least one numerical character


    public static String PasswordCreation() {
        char[] a = {'a', 'b', 'c', 'd', 'e', 'd', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] b = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
        int[] c = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        //char[] d = {(char) (33), (char) (34), (char) (35), (char) (36), (char) (37), (char) (38), (char) (39), (char) (40), (char) (41), (char) (42), (char) (43), (char) (44), (char) (45), (char) (46), (char) (47), (char) (58), (char) (59), (char) (60), (char) (61), (char) (62), (char) (63), (char) (64), (char) (91), (char) (92), (char) (93), (char) (94), (char) (95), (char) (96), (char) (124), (char) (125), (char) (126)};
        char[] e = ("!@#$%^&*()-=[]" + (char)(92) + ";'/.,<>?:{}|+_").toCharArray();
        String str2 = "";

            str2 = str2 + a[(int) (Math.random() * (a.length - 1))];
            str2 = str2 + b[(int) (Math.random() * (b.length - 1))];
            str2 = str2 + c[(int) (Math.random() * (c.length - 1))];
            str2 = str2 + e[(int) (Math.random() * (e.length - 1))];

            char[] finalArray = str2.toCharArray();




        StringBuilder str = new StringBuilder();

            str.append(a[(int) (Math.random() * (a.length - 1))]);
            str.append(b[(int) (Math.random() * (b.length - 1))]);
            str.append(c[(int) (Math.random() * (c.length - 1))]);
            str.append(e[(int) (Math.random() * (e.length - 1))]);

                Arrays.sort(finalArray);
                for (int i=0; i < 4;i++){
                    str.append(finalArray[(int) (Math.random() * (finalArray.length - 1))]);
                }

        return str.toString();
    }

    public static void main(String[] args) {
        String str = PasswordCreation();
        System.out.println("Your generated password:"+ str);
        System.out.println(str.length());
    }
}
