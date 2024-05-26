package arrays;

import java.util.Arrays;

public class Sudoku {
    static int[][] arr = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 4, 0, 0, 0, 0, 2, 5, 8},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}};



    public static void main(String[] args) {
       printArrays(answer(arr));
    }

    public static int[][] answer(int[][] arr){

        for (int i = 0; i < 9; i++){

            int num = 1;
            for (int j = 0; j < 9;){
                if (arr[i][j] == 0 && num <= 9) {
                    if (isValidNumber(arr, i, j, num)) {

                        arr[i][j] = num;
                        j++;
                        num = 1;
                    }
                    else
                        num++;

                }
                else
                    j++;

            }
        }
        return arr;
    }

    public static boolean isValidNumber(int[][] arr, int row, int column, int num){
        for (int i = 0; i < arr[row].length; i++) {
                if (arr[row][i] == num || arr[i][column] == num)
                    return false;
        }
        return true;
    }

    public static void printArrays(int[][] arr){

        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
