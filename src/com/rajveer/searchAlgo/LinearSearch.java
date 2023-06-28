package com.rajveer;

public class LinearSearch {

    public static void main(String[] args) {

        int[] element = {1, 2, 85 ,89, 23, 56 , 809, 458, 20};
        int target = 809;
        boolean ans = linearSearch2(element,target);
        System.out.println(ans);
    }


    static boolean linearSearch2(int[] element, int target){

        if (element.length == 0){
            return false;
        }
        for (int i = 0; i < element.length; i++) {
            if (element[i] == target){
                return true;
            }
        }
        return false;

    }

    static int linearSearch(int[] element, int target){

        if (element.length == 0){
            return -1;
        }
        for (int i = 0; i < element.length; i++) {
            if (element[i] == target){
                return i;
            }
        }
        return -1;

    }
}
