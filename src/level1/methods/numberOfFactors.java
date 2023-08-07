package level1.methods;

public class numberOfFactors {

    public int factorCount(int a){
        int count = 1;
        for (int i = 1; i < a; i++){
            if(a % i == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        numberOfFactors obj = new numberOfFactors();
        System.out.println("Number of factors is: " + obj.factorCount(12));
    }

}
