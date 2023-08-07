package level1.Loops;

public class sumOfNumbersFrom {

    public void sum() {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            if ( i % 2 == 0) {
                sum = sum + i;
                System.out.println(sum);
            }
        }
    }

    public static void main(String[] args) {
        //Write a program to print the sum of all the even numbers from 1 to 50.
       sumOfNumbersFrom obj = new sumOfNumbersFrom();
       obj.sum();
    }
}
