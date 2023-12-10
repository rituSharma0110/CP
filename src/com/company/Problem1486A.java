package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem1486A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
         while (tc-->0) {
             int size = scanner.nextInt();
             int[] array = new int[size];
             long sum = 0;
             long sum1= 0;
             boolean isPossible = true;
             for (int i = 0; i < array.length; i++) {
                 array[i] = scanner.nextInt();
                 sum += array[i];
                 sum1 +=i;
                 if (sum<sum1) {
                     isPossible = false;
                 }
             }
             if (isPossible) {
                 System.out.println("YES");
             } else {
                 System.out.println("NO");
             }

         }
    }
}
