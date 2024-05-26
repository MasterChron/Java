package level1.methods;

public class balanceBetweenEqualAndOdd {

    public static int number(int low, int high, int k){
        int count = 0;
        for (int i=low;i <= high; i++){
            boolean temp = false;
            if (i % k == 0){
               temp = check(i);
            }
            if (temp){
                count++;
            }
        }
        return count;
    }

    public static boolean check(int num) {
        int evenCount = 0;
        int oddCount = 0;
        if (num < 10 && num >= 0) {
            return false;
        }
        if(num < 0){
            num *= -1;
        }
        boolean evenAndOdd = false;

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                evenCount++;
            }
            else {
                oddCount++;
            }
            if(evenCount == oddCount){
                evenAndOdd = true;
            }
            num /= 10;
        }
        return evenAndOdd;
    }

    public static void main(String[] args) {
        System.out.println(number(-20,20,2));
    }
}
