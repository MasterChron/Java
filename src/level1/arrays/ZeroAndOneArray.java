package level1.arrays;

public class ZeroAndOneArray {
    public void zeroOrOne(int[] arr) {
        boolean flag = false;
        for (int j : arr) {
            if (j == 0 || j == 1) {
                System.out.println("The array contains either a zero or a one.");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("The array does not contain zero or a one.");
        }
    }
    public static void main(String[] args) {
//        Given an array, check if an array is without 0 and 1.
        ZeroAndOneArray obj = new ZeroAndOneArray();
        int[] arr = new int[] {1,5,3,2,0};
       obj.zeroOrOne(arr);
    }
}
