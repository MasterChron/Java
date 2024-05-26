package level1.methods;

public class factorialNumber {

    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }
    public static int findFactorial(int num){
        int factorial = num;
        for (int i = num; i > 1; i--){
            factorial = factorial * (i - 1);
        }
        return factorial;
    }
}
