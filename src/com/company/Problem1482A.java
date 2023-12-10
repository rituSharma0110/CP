package com.company;

import java.util.Scanner;

public class Problem1482A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        while (tc-->0){
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            int ans = r*c;
            System.out.println(ans);
        }
    }
}
