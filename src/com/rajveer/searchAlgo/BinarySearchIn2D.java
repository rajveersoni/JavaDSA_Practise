package com.rajveer;

import java.util.Arrays;

public class BinarySearchIn2D {

    public static void main(String[] args) {

        int[][] matrix = { {10,20,30},
                {15,25,35},
                {17,27,37}
        };
        int target = 27;
        int[] ans = searchBS(matrix,target);
        System.out.println(matrix.length);
        System.out.println(Arrays.toString(ans));


    }

    static int[] searchBS(int[][] matrix, int target){

        int row = 0;
        int col = matrix.length-1;


        while(row <= matrix.length-1 && col >=0){

            if (matrix[row][col] == target){
                return new int[]{row,col};

            }
            if (matrix[row][col] > target){
                col--;
            }
            else {
                row++;
            }

        }
        return new int[]{-1,-1};
    }
}
