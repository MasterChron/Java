package level1.methods;

public class armStrongNumber {

    public static void main(String[] args) {
        System.out.println(armStrong(371));
    }

    public static boolean armStrong(int num){

        int originalValue = num;
        String str = Integer.toString(num);
        int digits = str.length();
        int totalValue = 0;

        for (int i = 0; i < digits; i++){
            int temp = num % 10;
            totalValue += (int) Math.pow(temp,3);
            num /= 10;
        }
        return totalValue == originalValue;
    }
}
