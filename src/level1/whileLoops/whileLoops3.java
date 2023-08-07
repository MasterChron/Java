package level1.whileLoops;

public class whileLoops3 {

//    Write a program to print the sum of first 100 natural numbers.

    public static void main(String[] args) {

        int sum = 0;

        int num = 1;

        while (num <= 100) {



            sum = sum + num;

            num++;
        }

        System.out.println(sum);

    }

}
