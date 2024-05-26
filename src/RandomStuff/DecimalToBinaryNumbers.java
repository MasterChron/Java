package RandomStuff;

import java.util.Stack;

public class DecimalToBinaryNumbers {

    public static void main(String[] args) {
        decimalToBinary(256);
    }

    public static void decimalToBinary(int num){
        System.out.print("Decimal: " + "\"" + num + "\"" + " in binary: ");
        Stack<Integer> stack = new Stack<>();
        while (num > 0){
            stack.push((num % 2));
            num /= 2;
        }

        for (boolean i = false; i == stack.isEmpty();){
            System.out.print(stack.pop());
        }
    }
}