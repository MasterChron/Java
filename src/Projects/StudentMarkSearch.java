package Projects;

public class StudentMarkSearch {

    static int count;


    public static void main(String[] args) {
        int[] marks = {5, 7, 7, 9, 9, 9, 10, 11, 13, 13, 13, 13, 13, 14, 15, 17, 17, 17, 18, 19, 20, 20};
        System.out.println(search(marks, 0, marks.length - 1, 13));
    }

    public static int search(int[] arr, int l, int r, int val){
        int middle = (r - l)/2;

        if (arr[middle] == val)
            return lSearch(arr, middle, val);
        else if(arr[middle] > val)
            return search(arr, l, middle - 1, val);
        else if(arr[middle] < val)
            return search(arr, middle + 1, r, val);
        else return -1;
    }

    public static int lSearch(int[] arr, int index, int val){
        int i = 1, j = 1, count = 1;
        while (arr[index + i] == val || arr[index - j] == val){
            if (arr[index + i] == val) {
                count++;
                i++;
            }
            if (arr[index - j] == val) {
                count++;
                j++;
            }
        }
        return count;
    }
}
