package level1.Loops;

public class forLoops {

    public void pattern() {
        int rows = 6;

        for (int i = 0; i <=rows; i++) {
            for(int j = i; j >= 1 ; j--) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {

//        1
//        2 1
//        3 2 1
//        4 3 2 1
//        5 4 3 2 1
        forLoops obj = new forLoops();
        obj.pattern();

    }
}
