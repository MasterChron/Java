package level1.arrays;

public class AverageOfAnArray {

    public int average(int[] arr) {
        int sum = 0;
        int average = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        average = sum / arr.length;

        return average;
    }

    public static void main(String[] args) {

        AverageOfAnArray obj = new AverageOfAnArray();
        int[] arr = {1,2,3,4,5,6,7,8};
        int result = obj.average(arr);
        System.out.println("The average of the array is " + result);

    }

    }


