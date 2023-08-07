package level1.arrays;

import java.util.Arrays;

public class ArrayRandomizer {

    public static int[] questionRandomizer(){
        int[] a = new int[10];
        a[0] = (int)(Math.random() * 20);
        int temp;
        for(int i=1; i < a.length; i++){
            temp = (int)(Math.random() * 20);
            while(a[i - 1] == temp){
                temp = (int)(Math.random() * 20);
            }
            a[i] = temp;
        }
        Arrays.sort(a);
        for(int j=0; j<a.length - 1; j++){
            temp = a[j + 1];
            while(temp == a[j]){
                temp = (int) (Math.random() * 20);
                a[j + 1] = temp;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = questionRandomizer();
        System.out.println(Arrays.toString(arr));
    }
}
