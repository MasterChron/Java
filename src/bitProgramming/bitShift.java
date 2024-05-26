package bitProgramming;

public class bitShift {

    public static void main(String[] args) {
        int a = 12;
        a = a>>1;

        long x = Math.round(0.4);

        System.out.println("Shifting result: " + a);
        System.out.println(round(66435.532));
    }

    public static float round(double a){
        int x = (int)a;
        double r = a - x;
        if (r >= 0.5){
           return (float) (a + (1.0 - r));
        }
        else{
            return (int)(a);
        }
    }
}
