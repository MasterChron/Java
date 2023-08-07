package level1.Loops;

public class evenOrOddIncrease {

    public void evenOrOdd() {
        int counter1 = 0;
        int counter2 = 0;

        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0) {
                counter1 = counter1 + 1;
            }
            if (i % 2 != 0) {
                counter2 = counter2 + 3;
            }
        }
        System.out.println("Counter 1: " + counter1);
        System.out.println("Counter 2: " + counter2);
    }
    public static void main(String[] args) {
        evenOrOddIncrease obj = new evenOrOddIncrease();
        obj.evenOrOdd();
    }
}
