package com.company;

import java.util.Scanner;

public class Problem1467A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextByte();
        while (tc-->0){
            int n = scanner.nextInt();
            if (n<3){
                int j =9;
                for (int i =0;i<n;i++){
                    System.out.print(j + "");
                    j--;
                }
                System.out.println();
            }
            if (n==3){
                System.out.println("989");
            }else if (n>=3) {
                System.out.print("989");
                for (int i = 3; i < n; i++) {
                    System.out.print((i-3)%10);
                }
                System.out.println();
            }
        }
    }
}
