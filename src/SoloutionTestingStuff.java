import java.util.HashMap;

public class SoloutionTestingStuff {

    public static int romanToInt(String s) {
        char[] arr = s.toCharArray();

        int num = 0;

        for (int i = 0; i < arr.length; i++){

            if (i < arr.length - 1) {
                if (getInt(arr[i]) < getInt(arr[i + 1])) {
                    num += (getInt(arr[i + 1]) - getInt(arr[i]));
                    i++;
                    continue;
                }
            }
            num += getInt(arr[i]);
        }

        return num;
    }

    public static int getInt(char x){

        switch (x){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
