package RandomStuff;

public class toLowerAndUpperCase {

    public static void main(String[] args) {
        System.out.println(toUpperCase("UpPerCase"));
        System.out.println(toLowerCase("lOweRCASe"));
    }

    public static String toUpperCase(String str){
        char[] arr = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < arr.length; i++){
            if ((int)arr[i] >= 'a'){
                arr[i] = (char)(arr[i] - 32);
                }
            }
        for (char x: arr){
            stringBuilder.append(x);
            }
        return stringBuilder.toString();
        }
    public static String toLowerCase(String str){
        char[] arr = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < arr.length; i++){
            if ((int)arr[i] <= 'Z'){
                arr[i] = (char)(arr[i] + 32);
            }
        }
        for (char x: arr){
            stringBuilder.append(x);
        }
        return stringBuilder.toString();
    }
}
