package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem1473B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            String s = scanner.next();
            String t = scanner.next();
            BigInteger sLen = BigInteger.valueOf(s.length());
            BigInteger tLen = BigInteger.valueOf(t.length());
            BigInteger lcm = sLen.multiply(tLen).divide(tLen.gcd(sLen));
            String res1 ="";
            String res2 ="";
            int val = Integer.parseInt(String.valueOf(lcm));
            while (res1.length()<val){
                res1+=s;
            }
            while (res2.length()<val){
                res2+=t;
            }
            if (res1.equals(res2)){
                System.out.println(res1);
            }else System.out.println(-1);

        }
    }

}
