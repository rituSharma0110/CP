package com.company;

import java.util.Scanner;

public class Problem1350A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int sum = n;
                int fac = factor(sum);
                sum= sum + fac;

                int ans = (k-1)*2 + sum;
            System.out.println(ans);
        }

    }
    static int factor(int n){
        int fac = 2;
        for (int i =2;i<=n;i++){
            if (n%i==0){
                fac = i;
                break;
            }
        }
        return fac;
    }

}
