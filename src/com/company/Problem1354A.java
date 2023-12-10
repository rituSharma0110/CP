package com.company;

import java.util.Scanner;

public class Problem1354A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();
            long d = scanner.nextLong();
            if (b>=a){
                System.out.println(b);
            }else if (d>=c){
                System.out.println(-1);
            }else {
                 {
                    long ans = (long)(Math.ceil((double) (a - b) / (c - d))) * c;
                    ans += b;
                    System.out.println(ans);
                }
            }
        }
    }
}
