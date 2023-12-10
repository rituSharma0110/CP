package com.company;

import java.util.Scanner;

public class Problem1493A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println((n-k)+(k/2));
            for (int i=k+1;i<=n;i++){
                System.out.print(i + " ");
            }
            for (int i = (k+1)/2;i<k;i++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
