package com.company;

import java.util.Scanner;

public class Problem1204B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        long maxSum = 0;
        long minSum = 0;
        long a = 1;
        for (int i = 0; i < l; i++) {
            minSum += a;
            a *=2;
        }
        minSum += n-l;
        a = 1;
        for (int i = 0; i < r; i++){
            maxSum += a;
            a *= 2;
        }
        if (a != 1)
            a /= 2;
        maxSum += (n-r) * a;
        System.out.println(minSum + " " + maxSum);

    }
}
