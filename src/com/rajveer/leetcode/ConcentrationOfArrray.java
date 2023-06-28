package com.rajveer;

import java.util.Arrays;
import java.util.Scanner;

public class ConcentrationOfArrray {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ip.nextInt();

        }
        getConcatenation(nums);
//        System.out.println(Arrays.toString(getConcatenation(nums)));

    }

    static void getConcatenation(int[] nums) {

        int[] ans = new int[2 * nums.length];


        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = ans[i];
        }

//        for (int j = nums.length; j < ans.length; j++) {
//            ans[j] = nums[j-nums.length];
//        }

        System.out.println(Arrays.toString(ans));
    }
}
