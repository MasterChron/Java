package Recursion;

public class FibonacciSeries {
static int firstNum = 0;
static int secondNum = 1;
    public static void main(String[] args) {
        System.out.print(0 + ", " + 1);
        fibonacciSeriesRecursion(5);
    }

//    public static void fibonacciSeries(int numOfSequence){
//        int firstNum = 0;
//        int secondNum = 1;
//        int sum = 0;
//
//        System.out.print(firstNum + ", " + secondNum);
//
//        for (int i = 0; i < numOfSequence; i++){
//            sum = firstNum + secondNum;
//            System.out.print(", "  + sum);
//            firstNum = secondNum;
//            secondNum = sum;
//        }
//        System.out.print(".\n\nFibonacci Series Complete.\n");
//    }

    public static void fibonacciSeriesRecursion(int count){
        int sum;

        sum = firstNum + secondNum;
        firstNum = secondNum;
        secondNum = sum;

        if(count > 0){
            System.out.print(", " + sum);
            fibonacciSeriesRecursion(count - 1);
        }
    }
}
