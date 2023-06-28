package com.rajveer;

public class StringLinearSearch {

    public static void main(String[] args) {

        String name = "Rajveer";
        char target = 'v';

        System.out.println(linearSearch2(name, target));
    }


    private static boolean linearSearch2(String name, char target) {
        if (name.length() == 0){
            return false;
        }

        for (char ch :
                name.toCharArray()) {
            if (ch == target){
                return true;
            }
        }
        return false;
    }
    private static boolean linearSearch(String name, char target) {
        if (name.length() == 0){
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == target){
                return true;
            }

        }
        return false;
    }
}
