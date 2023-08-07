package level1.strings;

public class ReverseAString {

    public static String reverseString(String str){
        char[] a = str.toCharArray();
        String str2 = "";

        for (int i = a.length - 1; i >= 0; i--){
            str2 = str2 + a[i];
        }
        return str2;
    }

    public static void main(String[] args) {
        String str = reverseString("Java");
        System.out.println(str);
    }
}
