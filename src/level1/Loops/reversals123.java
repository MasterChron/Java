package level1.Loops;

public class reversals123 {

//            5
//            4 4
//            3 3 3
//            2 2 2 2
//            1 1 1 1 1

    public void reversalPattern(){
        int rows = 5;

        for (int i = 0; i >= rows; i--) {
            for (int j = 0; j >= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        reversals123 obj = new reversals123();
        obj.reversalPattern();

    }
}
