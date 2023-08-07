package level1.methods;

public class consecutiveNumbers {

    public boolean consecutive(int a, int b, int c){

        if(a + 1 == b && b + 1 == c){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        consecutiveNumbers obj = new consecutiveNumbers();
        System.out.println(obj.consecutive(1,2,4));
    }

}
