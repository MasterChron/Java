package level1.arrays;

import java.util.Arrays;

public class MissingNumberInArray {
//    Given a sorted array. Find the first missing number in the array.
//    Example - arr = [1,2,3,5,6]. Here the missing number is 4.

    public int missingNumber(int[] arr){
        int N = arr.length;
        int ans = 0;

        for (int i = 0;i < N - 1; i++) {
            if(arr[i + 1] != arr[i] + 1) {
                ans = arr[i] + 1;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{100, 101, 102, 103, 105};
       MissingNumberInArray obj = new MissingNumberInArray();
        System.out.println("Missing number is: " + obj.missingNumber(arr));
    }
}
