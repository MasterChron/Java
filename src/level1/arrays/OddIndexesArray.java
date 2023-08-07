package level1.arrays;

public class OddIndexesArray {

    public void oddIndex(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        OddIndexesArray obj = new OddIndexesArray();
        obj.oddIndex(arr);
    }
}
