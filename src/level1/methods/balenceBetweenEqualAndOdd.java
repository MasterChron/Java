package level1.methods;

public class balenceBetweenEqualAndOdd {

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
        if (num < 10) {
            return false;
        }

        boolean even = false;
        boolean odd = false;

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                even = true;
            } else {
                odd = true;
            }
            num /= 10;
        }
        return even && odd;
    }


    public static void main(String[] args) {
        System.out.println(number(10,20,2));
    }
}
