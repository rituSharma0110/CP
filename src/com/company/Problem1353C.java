package com.company;

import java.util.Scanner;

public class Problem1353C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while(tc-->0){
            int n = scanner.nextInt();
            long sum = 0;
            int var = 0;
            int size = 0;
            while (n>0){
               sum+= (long) var *size;
               size+=8;
               var++;
               n-=2;
            }
            System.out.println(sum);
        }
    }
}
