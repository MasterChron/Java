package level1.whileLoops;

public class whileLoops6 {


//    Write a program to determine the reverse of a number accepted by the user.
//Ex —> 234 —> reverse will be 432
//    Write a program to determine the reverse of a number accepted by the user.


    public static void main(String[] args) {

        int reverse = 0;

        int digit;

        int num = 3456;

        while (num > 0)  {

            digit = num % 10;

            reverse = reverse * 10 + digit;

            num = num / 10;


        }

        System.out.println(reverse);

    }


}
