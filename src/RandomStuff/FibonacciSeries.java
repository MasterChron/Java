package RandomStuff;

public class FibonacciSeries {
    static int firstNum = 0;
    static int secondNum = 1;

    public static void main(String[] args) {
        System.out.print("0, 1,");
        fibSeries(5);
    }

    public static void fibSeries(int n) {
        int sum;

        sum = firstNum + secondNum;
        firstNum = secondNum;
        secondNum = sum;

        if (n > 0) {
            System.out.print(sum + ", ");
            fibSeries(n - 1);
        }
        System.out.print(".....");
    }
}
