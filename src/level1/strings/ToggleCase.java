package level1.strings;

public class ToggleCase {

    public static String toggleString(String str){
     char[] a = str.toCharArray();

     for(int i=0; i < a.length; i++){
         if(a[i] >= 65 && a[i] <= 90){
         a[i] = (char)(a[i] + 32);
        }
         else if (a[i] >= 97 && a[i] <= 122) {
             a[i] = (char)(a[i] - 32);
         }
        }
     StringBuilder str2 = new StringBuilder();
     for (int j=0; j < a.length; j++){
         str2.append(a[j]);
     }
     return str2.toString();
    }

    public static void main(String[] args) {
        String str = "AbCDEfgh2";
        System.out.println(toggleString(str));
    }
}
