package com.company;

import java.util.Scanner;

public class Problem598A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            long n = scanner.nextInt();
            long ans1 = n *(n+1)/2;
             long pow = 1;
             while (pow<=n){
                 ans1 =ans1- pow*2;
                 pow *=2;
             }

            System.out.println(ans1);
        }
    }
}
