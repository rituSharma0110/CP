package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem1525A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
           BigInteger number = scanner.nextBigInteger();
           BigInteger ans = BigInteger.valueOf(100).divide(number.gcd(BigInteger.valueOf(100)));
            System.out.println(ans);
        }
    }
}
