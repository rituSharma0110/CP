package com.company;

import java.util.Scanner;

public class Problem1359A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            int max = Math.min(n/k, m) ;
            int rem = m - max ;
            int ans = max - (int)Math.ceil(rem*1.0/ (k-1)) ;
            System.out.println(ans);

        }

    }
}
