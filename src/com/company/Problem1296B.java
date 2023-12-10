package com.company;

import java.util.*;

public class Problem1296B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            if (n<10){
                System.out.println(n);
                continue;
            }

            long sum =n;
            long num =n;
            while (num>=10){
                int remainder = (int) (num%10);
                num/=10;
                sum += num;
                long var = num + remainder;
                num = var;
            }
            System.out.println(sum);
        }
    }
}
