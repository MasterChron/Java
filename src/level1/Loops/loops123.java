package level1.Loops;

public class loops123 {

    public void pattern() {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for(int j = 0; j < i ; j++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {

        //1
        //2 2
        //3 3 3
        //4 4 4 4
        //5 5 5 5 5

        loops123 obj = new loops123();
        obj.pattern();

    }
}
