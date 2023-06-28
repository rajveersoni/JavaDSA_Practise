package com.rajveer;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {

//        int[] arr = {-22,-18,-10,-5,0,1,5,7,9,25,85,99};
        int[] arr = {99,88,77,66,55,44,33,22,11,5,1};
        int target = 5;
        int ans = 0;

        if (arr[0] < arr[arr.length-1]){

            ans = ascBinarySearch(arr, target);

        }else {
            ans = dscBinarySearch(arr, target);
        }

        System.out.println(ans);

    }

    private static int dscBinarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            int mid = start + (end-start)/2;

            if (target > arr[mid]){

                end = mid-1;

            } else if (target < arr[mid]) {

                start = mid + 1;

            }else {
                return mid;
            }

        }
        return -1;

    }

    private static int ascBinarySearch(int[] arr, int target) {
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
