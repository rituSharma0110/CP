package com.company;

import java.util.Scanner;

public class Problem1474B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int val = scanner.nextInt();
            int n1 = 1;
            int n2 = 1;
            for (int i = n1+val;; i++){
                if (isPrime(i)) {
                    n1 = i;
                    break;
                }
            }
            for (int i = n1+val;;i++){
                if (isPrime(i)) {
                    n2 = i;
                    break;
                }
            }
            System.out.println(n1*n2);
        }

    }
    static boolean isPrime(int n){
        boolean is = true;
        for (int i =2;i<=Math.sqrt(n);i++){
            if (n%i==0) {
                is = false;
            }
        }
        return is;
    }
}
