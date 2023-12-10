package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem1651A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            BigInteger ans = BigInteger.valueOf(2).pow(n).subtract(BigInteger.valueOf(1));
            System.out.println(ans);

        }

    }
}
