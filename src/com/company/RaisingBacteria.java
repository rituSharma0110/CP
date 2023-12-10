package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class RaisingBacteria {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
            BigInteger number = scanner.nextBigInteger();

        System.out.println(number.bitCount());
    }
}
