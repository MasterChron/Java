package arrays;

public class LinearSearch {

    public static void main(String[] args) {
        LinearSearch obj = new LinearSearch();
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(obj.search(arr, 5));
    }
    public boolean search(int[] arr, int val){
        for(int i: arr){
            if (i == val){
                return true;
            }
        }
        return false;
    }
}
