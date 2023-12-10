package com.company;

import java.util.Scanner;

public class CJRound1A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            String str = scanner.next();
            StringBuilder sbr1 = new StringBuilder(str);
            int min = minimum(str);
            sbr1.insert(min+1,str.charAt(min));

            for (int j =0;j<str.length();j++){
                if (str.charAt(j)-sbr1.charAt(j)<0){
                        sbr1.insert(j+1,str.charAt(j));
                }

            }
            System.out.println("Case #" + tc +  sbr1);
        }
    }
    static int minimum(String str){
        char min = 'Z';
        int min1 = 0;
        for (int i =0;i<str.length();i++){
            if (str.charAt(i)<min){
                min= str.charAt(i);
                min1 = i;
            }
        }
        return min1;
    }

}
