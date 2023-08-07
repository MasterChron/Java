package level1.strings;

import java.util.Objects;

public class ReversetheWords {

    public static String reverse(String str) {

        String[] s = str.trim().split(" ");

        StringBuilder ans = new StringBuilder();

        for(int i=s.length-1; i>=0; i--) {

            if(Objects.equals(s[i], "")) {
                continue;
            }

            ans.append(s[i]).append(" ");
        }

        return ans.toString();
    }


    public static void main(String[] args) {
        String str = "Java is an       amazing language ";
        System.out.println(reverse(str));
    }
}
