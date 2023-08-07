package level1.strings;

public class StringToALowercase {

    //You are given a character string A having a length N. Convert each character of A into lowercase of a character if it exists. If the lowercase of a character does not exist, it remains unmodified.
    //The uppercase letters from A to Z are converted to lowercase letters from a to z respectively.

    public static String toLowerCase(String a) {
        char[] b = a.toCharArray();
        char temp;

        StringBuilder str = null;
        for (int i = 0; i < b.length; i++) {
            if (b[i] >= 65 && b[i] <= 90) {
                b[i] = (char) (b[i] + 32);
            }
            str = new StringBuilder();
            for (int j = 0; j < b.length; j++) {
                str.append(b[j]);
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String a = "aBcDeF";
        a = toLowerCase(a);
        System.out.println(a);
    }
}
