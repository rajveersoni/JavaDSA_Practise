package com.rajveer;

import java.util.Arrays;

public class BubbleSortAlgo {

    public static void main(String[] args) {
        int[] arr = {5,4,2,1,3};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }


    static void bubble(int[] arr){

            boolean swapped;

        for (int i = 0; i < arr.length; i++) {  // run the steps n-1 times

            swapped = false;  // if the for j is not swapping any value means the array is already swapped, so no need to move further
            
            for (int j = 1; j < arr.length-i; j++) {
                for (int j = 1; j < arr.length-i; j++) {  //for each step maximum item will come at the last respective index

                //swap if the item is smaller than the previous item

                if (arr[j]< arr[j-1]){

                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){  // if swapped == false means not true --> break;
                break;
            }
        }

    }
}
