package level1.arrays;

public class MinimumArrayElement {

    public int minimumElement(int[] arr) {
        int num = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < num) {
                num = arr[i];
            }
        }
        return num;
    }

    public static void main(String[] args) {

//      Given an array, find the minimum element in the array.
        int[] arr = new int[]{-1,-2,4,8,-9};
        MinimumArrayElement obj = new MinimumArrayElement();
        System.out.println("The lowest element in the array is: " + obj.minimumElement(arr));
    }
}
