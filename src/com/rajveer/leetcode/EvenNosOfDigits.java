package com.rajveer;

public class EvenNosOfDigits {

    public static void main(String[] args) {

        int[] element = {1, 22, 85 ,89, 23, 56 , 12, 458, 20};

        System.out.println(Counts(element));

    }

    private static int Counts(int[] element) {
            int count = 0;

            if (element.length == 0 ){
                return 0;
            }

        for (int i :
                element) {
            if (even(i)) {

                count++;
            }
            }
        return count;
    }

    static boolean even(int i) {
        int count = 0;
        while (i!=0){
            i = i/10;
            count++;


        }
        if (count % 2 == 0){
            return true;
        }
        return false;
    }
}
