package Sorting;

import java.util.Arrays;

public class WiggleSort {

    static int[] arr = {3, 5, 2, 1, 6};
    //[0] <= [1] >= [2] <= [3] >= [4]

    public int[] sort(int[] arr){

        for (int i = 0; i < arr.length; i++){
            if (i % 2 == 1) {
                if (arr[i - 1] >= arr[i])
                    swap(i, i - 1);
                if (i + 1 < arr.length){
                    if (arr[i + 1] > arr[i]){
                        swap(i, i + 1);
                }
                }
            }
        }

        return arr;
    }

    public void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new WiggleSort().sort(arr)));
    }
}
