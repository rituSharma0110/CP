package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem80A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean is  = isNextPrime(a, b);
        if (is){
            System.out.println("YES");
        }else System.out.println("NO");



    }
    static boolean isNextPrime(int a, int b){
        boolean is = true;
        for (int i =2;i<a;i++){
            if (a%i==0){
                is = false;
            }
        }
        for (int i =2;i<b;i++){
            if (b%i==0){
                is = false;
            }
        }

        for (int i = a+1;i<b;i++){
            if (BigInteger.valueOf(i).isProbablePrime(1)){
                is = false;
            }
        }
        return is;

    }
}
