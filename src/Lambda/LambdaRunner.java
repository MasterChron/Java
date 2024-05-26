package Lambda;

public class LambdaRunner {

    public static void main(String[] args) {
        String name = "prabALab";
        char symbol = '!';
        MyInterface myInterface = (a, b) -> {
            System.out.println("Hello World.");
            System.out.println("It is a nice day, " + a + b);
        };
        myInterface.message(name, symbol);

    }
}
