package com.company;
import java.math.BigInteger;
import java.util.*;

public class Problem1618C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){

            int length = scanner.nextInt();
            Long [] array = new Long[length];
            for (int i =0;i<array.length;i++){
                array[i] = scanner.nextLong();
            }
            long gcd1 = 0, gcd2 = 0;
            for (int i = 0; i < length; i += 2){
                gcd1 = gcd(gcd1, array[i]);
            }
            for (int i = 1; i < length; i += 2){
                gcd2 = gcd(gcd2, array[i]);
            }
            boolean isPossible = true;
            for (int i = 1; i < length; i += 2) {
                if (array[i] % gcd1 == 0) {
                    isPossible = false;
                    break;
                }
            }
            if (isPossible) {
                System.out.println(gcd1);
                continue;
            }
            isPossible = true;
            for (int i = 0; i < length; i += 2) {
                if (array[i] % gcd2 == 0) {
                    isPossible = false;
                    break;
                }
            }
            if (isPossible) {
                System.out.println(gcd2);
            }else System.out.println(0);

        }
    }
     static long gcd(long a, long b) {
        return b == 0 ? (a < 0 ? -a : a) : gcd(b, a % b);
    }
}
