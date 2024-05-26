package level1.conditionals;

public class LargestNumberOfThree {

    public static void main(String[] args) {
        largestOfThree(1,2,3);
    }

    public static void largestOfThree(int a, int b, int c){
        if(a < b && c < b){
            System.out.println("Largest of the three numbers is: " + b);
        }
        else if(b < a && c < a){
            System.out.println("Largest of the three numbers is: " + a);
        }
        else if(a < c && b < c){
            System.out.println("Largest of the three numbers is: " + c);
        }
        else {
            System.out.println("All numbers are equal");
        }

    }
}
