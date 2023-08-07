package level1.arrays;

import java.util.Arrays;

public class RotateArray {


    public int[] reverseArray(int[] a, int N, int start, int end)  {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        return a;
    }

    public static void main(String[] args) {
        RotateArray obj = new RotateArray();

        int[] arr = {1,2,3,4,5,6};
        int N = arr.length;
        int B = 2;
        B%=N;

        int start = 0;
        int end = N - 1;

        obj.reverseArray(arr,N,start,end);

        start = 0;
        end = B - 1;

        obj.reverseArray(arr, N, start, end);

        start = B;
        end = N-1;

        System.out.println("Rotated array: " + Arrays.toString(obj.reverseArray(arr,N,start,end)));
    }
}
