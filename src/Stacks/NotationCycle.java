package Stacks;

import java.util.Stack;

public class NotationCycle {

    public static void main(String[] args) {

        System.out.println(infixToPostFix("((A + B) * C - (D - E) / F)"));
    }

    public static String infixToPostFix(String src){
        Stack<Character> operators = new Stack<>();
        src = src.trim();
        src = src.replace(" ", "");
        char[] equation = src.toCharArray();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < equation.length; i++){
            switch (equation[i]){
                case '(', '*', '/', '+', '-':
                    operators.push(equation[i]);
                    break;
                case ')':
                    while (!operators.isEmpty() && operators.peek() != '('){
                        str.append(operators.pop());
                    }

                    //
                    if (!operators.isEmpty()){
                        operators.pop();
                    }
                    break;
                default:
                    str.append(equation[i]);

            }
        }
        while (!operators.isEmpty())
            str.append(operators.pop());

        return str.toString();
    }
}
