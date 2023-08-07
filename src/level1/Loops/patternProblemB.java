package level1.Loops;

public class patternProblemB {

    public void pattern(){
        int rows = 0;

        for( int i = 5; i >= rows; i-- ) {
            for(int j = 0; j < i + 1 ; j++ ) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        patternProblemB obj = new patternProblemB();
        obj.pattern();
    }
}
