package com.rajveer;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-22,-18,-10,-5,0,1,5,7,9,25,85,99};
        int target = 25  ;

        int ans = binarySearch(arr, target);
        System.out.println(ans);


    }

    static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            int mid = start + (end-start)/2;

            if (target< arr[mid]){

                end = mid-1;

            } else if (target> arr[mid]) {

                start = mid + 1;

            }else {
                return mid;
            }

        }
        return -1;


    }

}
