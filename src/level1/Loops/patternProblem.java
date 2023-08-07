package level1.Loops;

public class patternProblem {

    public void pattern(){
        int rows = 5;

        for(int i = 0; i <= rows; i++) {

            for(int j = 0; j < i + 1 ; j++ ) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args){
            patternProblem obj = new patternProblem();
            obj.pattern();
        }
}