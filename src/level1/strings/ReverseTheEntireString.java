package level1.strings;

public class ReverseTheEntireString {

    //Reverse the String - III
    //You have the reverse the entire string. Example is given below
    //
    //Ex - “Java is cool”
    //Reversed - “looc si avaJ”

    public static void reverseString(String str){
        char[] a = str.toCharArray();
        StringBuilder str2 = new StringBuilder();
        StringBuilder str3 = new StringBuilder();
        for(int i=a.length - 1; i >= 0; i--){
            str2.append(a[i]);
            str3.append(a[i]);
        }
        System.out.println("Reversed String: " + str2);
        System.out.println(str3);
    }

    public static void main(String[] args) {
        reverseString("This is a String.");
    }
}
