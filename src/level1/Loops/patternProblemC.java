package level1.Loops;

public class patternProblemC {

    public void pattern(){
        int rows = 7;

        for (int i = 0; i < rows; i++) {

            for(int j = 0; j < i + 1 ; j++ ) {

                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for( int i = rows; i >= 1; i-- ) {
            for(int j = 0; j < i - 1 ; j++ ) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        patternProblemC obj = new patternProblemC();
        obj.pattern();
        }
    }






