package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int[] arr = {7, 12, 1, 6, 9, 2};
        System.out.println(Arrays.toString(ss.sort(arr)));
    }

    public int[] sort(int[] arr){
        int min;
        for (int i = 0; i < arr.length; i++){
            min = arr[i];
            for (int j = i; j < arr.length; j++){
                if (arr[j] < min){
                    min = arr[j];
                    int temp = arr[i];
                    arr[i] = min;
                    arr[j] = temp;
                }
            }

        }
        return arr;
    }
}
