package level1.arrays;

import java.util.Arrays;

public class ReverseArrays2 {

    public int[] reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int temp;
        int rotation = 0;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        ReverseArrays2 obj = new ReverseArrays2();
        int[] arr = new int[] {1 ,2 ,3 ,4 ,5 ,6};
        System.out.println(Arrays.toString(obj.reverse(arr)));
    }
}
