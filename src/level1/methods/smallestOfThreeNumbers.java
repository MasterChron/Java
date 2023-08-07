package level1.methods;

public class smallestOfThreeNumbers {

    public int smallest(int a, int b, int c){
        if(a > b && b < c){
            return b;
        }
        else if(c > a && a < b){
            return a;
        }
        else{
            return c;
        }
    }

    public static void main(String[] args) {
        smallestOfThreeNumbers obj = new smallestOfThreeNumbers();
        System.out.println(obj.smallest(4,2,3));
    }

}
