package level1.operators;

import java.util.Scanner;

public class squarePerimeter {

    public void perimeter(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello this programs aim to assists you in finding the value of the squares perimeter: ");
        System.out.println("\nPlease enter the value of one side of your square: ");

        int side = scan.nextInt();
        int perimeter = side * 4;
        System.out.println("The perimeter of your square is: " + perimeter);
    }

    public static void main(String[] args) {
        squarePerimeter obj = new squarePerimeter();
        obj.perimeter();
    }
}
