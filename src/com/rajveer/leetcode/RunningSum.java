package com.rajveer;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSum {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ip.nextInt();
        }

        runningSum(nums);
    }

    static void runningSum(int[] nums) {

        int temp = 0;
        for (int i = 0; i < nums.length-1; i++){

            temp = nums[i];
            nums[i+1] = nums[i+1] + temp;

        }
        System.out.println(Arrays.toString(nums));
    }
}
