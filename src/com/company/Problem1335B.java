package com.company;

import java.util.Scanner;

public class Problem1335B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            StringBuilder sbr = new StringBuilder("");
            for(int i = 0; i < n; i++) {
               sbr.append((char) (97 + i % b));
            }
            System.out.println(sbr);
        }

    }
}
