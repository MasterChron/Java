package level1.arrays;

public class MaximumArrayElement {

    public int maximumElement(int[] arr) {
        int num = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > num) {
                num = arr[i];
            }
        }
        return num;
    }

    public static void main(String[] args) {
//        Given an array, find the maximum element in the array.
        int[] arr = new int[] {-1,-2,-5,-2,-1};
        MaximumArrayElement obj = new MaximumArrayElement();
        System.out.println("The greatest element in the array was: " + obj.maximumElement(arr));
    }

}
