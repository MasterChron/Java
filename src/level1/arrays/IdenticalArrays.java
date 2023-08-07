package level1.arrays;

public class IdenticalArrays {

    public boolean Identical(int[] a, int[] b) {
        boolean identical = true;
        for (int i = 0; i < a.length; i++) {

            if (a.length == b.length) {
                int num1 = a[i];
                int num2 = b[i];

                if (num1 != num2) {
                    identical = false;
                    break;
                }

            }
            else {
                identical = false;
                break;
            }
        }
        return identical;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{2, 3, 4, 5};
        int[] arr1 = new int[]{2, 3, 4, 5};

        IdenticalArrays obj = new IdenticalArrays();

        System.out.println(obj.Identical(arr, arr1));


    }
}
