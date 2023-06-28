package com.rajveer;

import java.util.Scanner;

public class RichestCustomerWealth {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        int[][] accounts = new int[3][3];

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                accounts[i][j] = ip.nextInt();
            }

        }
        maximumWealth(accounts);
    }

    static void maximumWealth(int[][] accounts) {

        int wealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }

            if(temp >= wealth){
                wealth = temp;
            }
        }
        System.out.println(wealth);
    }


}
