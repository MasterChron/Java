package level1.whileLoops;

public class whileLoops7 {

//    Write a program to check whether a number is palindrome or not.
//    Example —> 121 is a palindrome number (same number if we read it from any end)

    public static void main(String[] args) {

        int reverse = 0;
        int digit;
        int num = 121;
        int num1 = num;

        while (num > 0)  {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (num1 == reverse) {
            System.out.println("Palindrome status: True");
        }
        else {
            System.out.println("Palindrome status: False");
        }
        System.out.println(reverse);
    }
}
