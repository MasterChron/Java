package level1.methods;

import java.util.ArrayList;
import java.util.Arrays;

public class swappingValues {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(swapNumbers(5,10)));
    }

    public static int[] swapNumbers(int num, int num2){
         int num3 = num2;

         num2 = num;
         num = num3;

        return new int[] {num, num2};
    }
}
