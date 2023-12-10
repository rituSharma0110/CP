package com.company;

import java.util.Scanner;

public class Problem1651B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
    out:    while (tc-->0){
            int n = scanner.nextInt();
            int[] array = new int[n];
            long a = 1;
            for (int i = 0; i < n; i++) {
                if (a > 1000000000) {
                    System.out.println("NO");
                    continue out;
                }
                array[i] = (int) a;
                a *= 3;
            }
        System.out.println("YES");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
        System.out.println();
        }
    }
}
