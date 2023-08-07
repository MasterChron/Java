package level1.Loops;

public class forLoopsProblem3 {

    public void pattern() {
        int num = 0;
        int rows = 0;

        for (int i = 4; i >= rows; i-- ) {
            num += 1;
            for (int j = 0; j < i + 1; j++ ) {
                System.out.print(num + " ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        forLoopsProblem3 obj = new forLoopsProblem3();
        obj.pattern();
    }
}
