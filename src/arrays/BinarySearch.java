package arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int index = findNum(arr,0, arr.length, 1);

        System.out.println("Your number is at the " + index + " index.");
        System.out.println(arr[index] + " is your num.");
    }

    public static int findNum(int[] arr, int beg, int end, int val){
        int mid = (beg + end)/2;
        if (arr[mid] > val){
            return findNum(arr, beg, mid - 1, val);
        }
        else if(arr[mid] < val){
            return findNum(arr, mid + 1, end, val);
        }
        else if(arr[mid] == val){
            return mid;
        }
        return -1;
    }
}
