package level1.arrays;

public class EvenNumbersInAnArray {

    public void EvenNumber(int[] a) {
        for (int i : a) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4,5,6,7,8};

       EvenNumbersInAnArray obj = new EvenNumbersInAnArray();

       obj.EvenNumber(arr);

        }
    }


