package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        int[] arr = {7, 4, 5, 2, 9, 12};

        System.out.println(Arrays.toString(obj.sort(arr)));
    }


    public int[] sort(int[] arr){
        int n = arr.length;
        boolean swapped;
        for (int k = 0; k < n - 1; k++){
            for (int i = 0; i < n-k-1; i++){
                swapped = false;
                if (arr[i] >= arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
                if(!swapped){
                    break;
                }
            }
        }
        return arr;
    }

}
