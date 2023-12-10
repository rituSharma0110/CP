package com.company;

import java.util.Scanner;

public class Problem1388B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int a = (n+3)/4;
            for (int i = 0; i < n - a; i++) {
                System.out.print(9);
            }
            for (int i = 0; i < a; i++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
