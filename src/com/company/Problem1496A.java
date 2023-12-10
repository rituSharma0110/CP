package com.company;

import java.util.Scanner;

public class Problem1496A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            int size = scanner.nextInt();
            int num = scanner.nextInt();
            String string = scanner.next();
            boolean isPal = checkForPalindrome(string,num);
            if (num == 0) {
                System.out.println("YES");
                continue;
            }

            if (size<num*2+1){
                System.out.println("NO");
                continue;
            }

            if (isPal){
                System.out.println("YES");
                continue;
            }
            System.out.println("NO");
        }

    }
    static boolean checkForPalindrome(String string, int num){
        char[] array = string.toCharArray();
        for (int i =0;i<num;i++){
            if (array[i]!=array[array.length-i-1]){
                return false;
            }
        }
        return true;
    }
}
