package level1.Loops;

public class patternFrenzy {

    public void pattern() {
        int num = 6;
        int rows = 0;

        for (int i = 4; i >= rows; i-- ) {
            num -= 1;
            for (int j = 0; j < i + 1; j++ ) {
                System.out.print(num + " ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
//        5 5 5 5 5
//        4 4 4 4
//        3 3 3
//        2 2
//        1
        patternFrenzy obj = new patternFrenzy();
        obj.pattern();
    }
}
