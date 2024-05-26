package arrays;

public class Pairs {

    public static void main(String[] args) {
        System.out.println(numOfPairs("ag"));
    }

    public static int numOfPairs(String str){
        char[] a = str.toCharArray();
        int pairs = 0;
        boolean b = false;
        int aCount = 0;
        int gCount = 0;
        for (int i=0; i < a.length; i++){
            if(a[i] == 'a') {
                aCount++;
            }
            if(a[i] == 'g'){
                pairs = pairs + (aCount);
                aCount = 0;
            }
        }
        return pairs;
    }
}
