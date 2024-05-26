package level1.prefixSum;

public class PrefixSum {

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4};
        int N = A.length - 1;
        int[] PS = new int[N];

        for (int i = 1; i < PS.length; i++) {
            PS[i] = PS[i-1] + A[i];
        }
    }
}
