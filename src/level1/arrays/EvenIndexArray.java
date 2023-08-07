package level1.arrays;

public class EvenIndexArray {

    public void EvenIndex(int[] a) {
        for (int i = 0; i < a.length; i++) {

            if (i % 2 == 0) {
                System.out.println(a[i]);
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7 ,8};

        EvenIndexArray obj = new EvenIndexArray();

        obj.EvenIndex(arr);

        }
    }