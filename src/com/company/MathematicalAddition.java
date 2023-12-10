package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class MathematicalAddition {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            BigInteger u = scanner.nextBigInteger();
            BigInteger v = scanner.nextBigInteger();

            BigInteger a = u.pow(2);
            BigInteger y = v.pow(2);
            BigInteger x = a.negate();


            System.out.println(x + " " + y);

        }
    }
}
