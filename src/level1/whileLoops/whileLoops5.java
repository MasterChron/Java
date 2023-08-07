package level1.whileLoops;

public class whileLoops5 {

//    Write a program to find the sum of all the digits in a number.

    public static void main(String[] args) {



        int sum = 0;

        int num = 45;

        while (num > 0) {

            int digit = num % 10;

            System.out.println(num);

            sum = sum + digit;

            num = num/10;

            System.out.println(num);

        }

        System.out.println(sum);

    }

}
