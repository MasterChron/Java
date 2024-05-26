package level1.methods;

public class SquaredNumbers {

    public static void main(String[] args) {

//        12.5, 60,
        //7,34

        double a = 12.5 - 7;
        double b = 60 - 34;

        System.out.println(hypotenuse(a, b));
    }

    public static double hypotenuse(double a, double b){

        return Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2)));
    }
}
