package level1.arrays;

public class SumOfArrays {

    public int sum(int[] arr){
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfArrays obj = new SumOfArrays();
        int[] arr = new int[] {1,2,3,4};
        System.out.println(obj.sum(arr));

    }

}
