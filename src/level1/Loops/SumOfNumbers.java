package level1.Loops;

public class SumOfNumbers {

    public void sumOfNumbers() {
        int sum = 0;
        for(int i = 1; i <=20; i++) {
            sum = sum + i ;
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
        SumOfNumbers obj = new SumOfNumbers();
        obj.sumOfNumbers();
    }
}
