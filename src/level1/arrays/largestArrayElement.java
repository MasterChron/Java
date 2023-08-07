package level1.arrays;

import java.util.Arrays;

public class largestArrayElement {

    public int secondLargestElement(int a[]) {
        int secondLargestNum = Integer.MIN_VALUE;
        int N = a.length - 1;
        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            if (a[N] > a[N - i] && a[N] != a[N - i]) {
                secondLargestNum = a[N - i];
                break;
            } else {
                secondLargestNum = a[i];
            }
        }
        return secondLargestNum;
    }
//    Given an array of size N. You have to find the second-largest element in the array. The array might contain duplicate elements.
    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4,5,6};
       largestArrayElement obj = new largestArrayElement();
        System.out.println("The second largest element in the array is: " + obj.secondLargestElement(arr));
        }

    }

