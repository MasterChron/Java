package level1;

public class Equilibrium {
    //Total Iterations is O(N) + O(N) = O(2N) iterations since 2 is a constant term the number of iterations is O(N)
    public static boolean equal(int[] arr) {
        int SL;
        int SR;
        int N = arr.length;
        int[] prefixSum = new int[N];
        prefixSum[0] = arr[0];
        //O(N) iterations
        for (int i = 1; i < N; i++){
            prefixSum[i] += prefixSum[i - 1] + arr[i];
        }
        //O(N) iterations
        for (int i = 0  ; i < arr.length; i++) {
            //First index nothing to the left of the index 0 so SL is just 0
            if (i == 0) {
                SL = 0;
            } else {
                SL = prefixSum[i - 1];
            }

            SR = prefixSum[N - 1] - prefixSum[i];

            if(SR == SL){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 8, 10};
        boolean equilibriumIndex = equal(arr);

        if (equilibriumIndex) {
            System.out.println("Equilibrium index found");
        } else {
            System.out.println("Their is no Equilibrium Index.");
        }
    }
}
