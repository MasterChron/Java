import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
 
    public static void main(String[] args) {
        int[]nums = {15,2, 11, 7};
        int[] nums2 = {3,2,4};
        int target = 9;
        int target2 = 6;

        System.out.println(Arrays.toString(solution(nums, target)));
    }

    public static int[] solution(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++){
            int complement = target - arr[i];

            if (map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }

}