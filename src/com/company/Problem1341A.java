package com.company;

import java.util.Scanner;

public class Problem1341A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc  = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            int exp1 = Math.abs(a-b);
            int exp2 = a+b;
            int exp3 = Math.abs(c-d);
            int exp4 = c+d;
            if (n * exp2< exp3 || n*exp1 >exp4){
                System.out.println("No");
            }else System.out.println("Yes");
        }
    }
}
