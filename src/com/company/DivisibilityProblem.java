package com.company;

import java.util.Scanner;

public class DivisibilityProblem {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            if (a%b==0){
                System.out.println(0);
                continue;
            }
            long ans = b- (a%b);
            System.out.println(ans);
        }
    }
}
