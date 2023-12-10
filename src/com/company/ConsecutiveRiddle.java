package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class ConsecutiveRiddle {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc -->0){
            BigInteger number = scanner.nextBigInteger();
            if (number.equals(BigInteger.valueOf(1))){
                System.out.println(0 + " " + 1);
            }else {
                BigInteger l = (number.subtract(BigInteger.valueOf(1)));
                BigInteger lValue = l.negate();
                BigInteger r = number;
                System.out.println(lValue + " " + r);
            }
        }
    }
}
