package com.company;

import java.util.Scanner;

public class BalancedSubstring {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int length = scanner.nextInt();
            String string = scanner.next();

            if (string.length()==1){
                System.out.println(-1 + " " + -1);
                continue;
            }

            char ch = string.charAt(0);
            boolean isOk = true;
            for (int i =0;i<string.length();i++){
                if (string.charAt(i)!=ch){
                    System.out.println((i) + " " + (i+1));
                    isOk =false;
                    break;
                }
            }
            if (isOk){
                System.out.println(-1 + " " + -1);
            }


        }

    }
}
