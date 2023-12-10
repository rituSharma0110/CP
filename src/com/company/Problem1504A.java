package com.company;

import java.util.Scanner;

public class Problem1504A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            String string = scanner.next();
            String str1 = string + "a";
            String str2 = "a" + string ;
            if (!checkForPalindrome(str1)){
                System.out.println("YES");
                System.out.println(str1);
                continue;
            }
            if (!checkForPalindrome(str2)){
                System.out.println("YES");
                System.out.println(str2);
                continue;
            }
            System.out.println("NO");

        }
    }


    static boolean checkForPalindrome(String string){
        char[] array = string.toCharArray();
        for (int i =0;i<= array.length/2;i++){
            if (array[i]!=array[array.length-i-1]){
                return false;
            }
        }
        return true;
    }

}
