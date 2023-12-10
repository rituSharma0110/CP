package com.company;

import java.util.Scanner;

public class Problem1342A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int min = Math.min(x,y);
            int max = Math.max(x,y);
            long sum1 = (long) min*b;
            sum1+= (long) (max - min) *a;

            long sum2 = (long) (x + y) *a;
            System.out.println(Math.min(sum2, sum1));
        }
    }
}
