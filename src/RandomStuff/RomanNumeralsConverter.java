package RandomStuff;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RomanNumeralsConverter {


    public static void main(String[] args) {
        romanNumValue(userInput());
    }

    public static void romanNumValue(String str){
        HashMap<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        char[] arr = str.toCharArray();

        int num = 0;

        for (int i = 0; i < arr.length; i++) {

                if (i + 1 < arr.length) {
                    if (romanNumerals.get(arr[i + 1]) > romanNumerals.get(arr[i])) {
                        num += romanNumerals.get(arr[i + 1]) - romanNumerals.get(arr[i]);
                        i++;
                    } else {
                        num += romanNumerals.get(arr[i]);
                    }
                }
                else {
                    num += romanNumerals.get(arr[i]);
                }
        }
        System.out.println("\nYour roman numeral value is: " + num);
    }

    public static String userInput() {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        while (true) {
            try {
                System.out.println("Please enter a roman numeral value: ");
                str = scanner.next();
            }
            catch (InputMismatchException e){
                System.out.println("\nSorry that isn't a proper roman numerical value.\nPlease try again. \n");
            }
            catch (Exception e){
                System.out.println("\nUnexpected Error.\nPlease Try Again.\n");
            }

            str = str.toUpperCase();
            char[] arr = str.toCharArray();
            boolean flag = false;
            for (char x: arr){
                //I, V, X, L, C
                if(!(x == 'I' || x == 'V' || x == 'X' || x == 'L' || x == 'C' || x == 'D' || x == 'M')){
                    System.out.println("Please enter a roman numerical value limited to C (100).");
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
        return str;
    }
}
