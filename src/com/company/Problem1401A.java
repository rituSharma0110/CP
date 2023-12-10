package com.company;

import java.util.Scanner;

public class Problem1401A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int a = scanner.nextInt();
            int k = scanner.nextInt();
            if (a>=k){
                if ((a%2- k%2 )==0){
                    System.out.println(0);
                }else {
                    System.out.println(1);
                }
            }else {
                int ans = Math.abs(k-a);
                System.out.println(ans);
            }


        }
    }
}
