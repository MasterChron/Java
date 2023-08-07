package level1.arrays;

public class OddNumbersInAnArray {
    public void oddNumber(int[] arr) {
        for (int i : arr) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        OddIndexesArray obj = new OddIndexesArray();
        obj.oddIndex(arr);
    }
}