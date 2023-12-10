package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem1646C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            BigInteger val = scanner.nextBigInteger();
            BigInteger sum = scanner.nextBigInteger();
            BigInteger squared = val.pow(2);
            BigInteger n = sum.divide(squared);
            System.out.println(n);

        }
    }
}
