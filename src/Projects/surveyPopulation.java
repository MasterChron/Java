package Projects;

import Polymorphism.A;

import java.util.*;

public class surveyPopulation {

    static String[] finalResult;

    public static void main(String[] args) {
        String arr[] = {"babita", "sona", "appu", "priya"};
        int ages[] = {10, 30, 50, 55};

        String names[] = {"kamal", "amit", "meenu", "priya"};
        int age[] = {20, 22, 35, 40};

        int[] results = mergeArrays(ages, age, arr, names);

        System.out.println(Arrays.toString(results));
        System.out.println(Arrays.toString(finalResult));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2, String[] names, String[] names2) {
        int length = arr1.length;
        int length2 = arr2.length;
        int[] result = new int[length + length2];
        String[] result2 = new String[names.length + names2.length];

        int i = 0, j = 0, k = 0;

        while (i < length && j < length2) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                result2[k] = names[i];
                i++;
            } else {
                result[k] = arr2[j];
                result2[k] = names2[j];
                j++;
            }
            k++;
        }

        while (i < length) {
            result[k] = arr1[i];
            result2[k] = names[i];
            k++;
            i++;
        }

        while (j < length2) {
            result[k] = arr2[j];
            result2[k] = names[j];
            j++;
            k++;
        }
        finalResult = result2;
        return result;
    }
}
