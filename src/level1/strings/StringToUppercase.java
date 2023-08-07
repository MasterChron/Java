package level1.strings;

public class StringToUppercase {

    public static String toUpperCase(String str){
        char[] a = str.toCharArray();

        for(int i=0; i < a.length; i++){
            if(a[i] >= 97 && a[i] <= 122){
                a[i] = (char)(a[i] - 32);
            }
        }
        StringBuilder str2 = new StringBuilder();
        for(int j=0; j < a.length; j++){
            str2.append(a[j]);
        }
        return str2.toString();
    }

    public static void main(String[] args) {
        String a = "abCdEgZ";
        System.out.println(toUpperCase(a));
    }

}
