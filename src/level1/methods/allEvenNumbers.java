package level1.methods;

public class allEvenNumbers {

    public boolean check(int a) {

        boolean check = true;

        while (a > 0) {
            int digit = a % 10;

            a = a / 10;
            if (digit % 2 != 0) {
                check = false;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        allEvenNumbers obj = new allEvenNumbers();
        System.out.println(obj.check(2456));
    }
}
