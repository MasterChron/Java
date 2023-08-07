package level1.arrays;

import java.util.Arrays;

public class reversalArray {

    public int[] reverse(int[] arr) {
        int N = arr.length - 1;
        int num;
        int num2;
        for (int i = 0; i < N/2; i++) {
            num = arr[i];
            num2 = arr[N - i];

            arr[i] = num2;
            arr[N - i] = num;
        }
        return arr;
    }

    //Reverse the array of size N. In-built methods are not allowed. Sorting is also not allowed as well. Cannot take a new Array.
    public static void main(String[] args) {

        int[] arr = new int[] {1, 2, 3, 4, 5};
        reversalArray obj = new reversalArray();
        System.out.println(Arrays.toString(obj.reverse(arr)));
    }
}
