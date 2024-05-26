package Projects;

import java.util.Arrays;

public class ArrivalAndDeparture {

    public static void main(String[] args) {
        double[] arr = {9.40, 9.50, 9.00, 11.00, 18.00, 15.00};
        double[] dep = {12.00, 11.20, 9.10, 11.30, 20.00, 19.00};
        //9.40 --> 12.00, 9.50 --> 11.20, 11.00 --> 11.30
        //{9.10, 11.20, 11.30, 12.00, 19.00, 20.00}
        //{9.00, 9.50, 11.00, 9.40, 15.00, 18.00}
        //if any train  arr[i] > time > dep[i]{ platform count++ }


        sort(dep, arr);

        System.out.println("Number of Platforms: " + findPlatform(arr, dep));
    }

    public static int findPlatform(double[] arr, double[] dep){
        int platforms = 0;

        for (int i = 0; i < arr.length - 1; i++){
            if (dep[i] >= arr[i + 1] && dep[i] <= dep[i + 1]){
               platforms++;
            }
        }

        return platforms;
    }


    public static void sort(double[] arr, double[] dep){
        double min;
        for (int i = 0; i < arr.length; i++){
            min = arr[i];
            for (int j = i; j < arr.length; j++){
                if (arr[j] < min){
                    min = arr[j];
                    double temp = arr[i];
                    double temp1 = dep[i];
                    dep[i] = dep[j];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    dep[j] = temp1;
                }
            }
        }
    }
}
