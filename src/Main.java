import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Hello this programs aim to assist you in finding the value of the triangle: ");

        System.out.println("\nPlease enter the value of the base of your triangle: ");

        int base = scan.nextInt();

        System.out.println("Please enter the value of the height of your triangle: ");

        int height = scan.nextInt();

        int area = (base * height) / 2;

        System.out.println("The area of your triangle is equal to: " + area);
    }
}