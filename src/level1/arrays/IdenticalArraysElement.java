package level1.arrays;

import java.util.Arrays;

public class IdenticalArraysElement {

    public int IdenticalElements(int[] a) {
        Arrays.sort(a);
        int N = a.length;

        int ans = 0;
        for (int i = 1; i < N - 1; i++) {
            if (a[i] == a[i + 1]) {
                ans = a[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        IdenticalArraysElement obj = new IdenticalArraysElement();

        int[] arr = new int[] {5,1,2,3,4,4};

        System.out.println("The repeating element is: " + obj.IdenticalElements(arr));
    }
}
