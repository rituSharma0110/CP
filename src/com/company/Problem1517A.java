package com.company;

import java.util.Scanner;

public class Problem1517A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            long number = scanner.nextLong();
            long ans = -1;
            if (number<2050){
                ans = -1;
            }else if (number%2050==0){
                long div = number/2050;
                long sum =0;
                while (div>0){
                    long remainder = div%10;
                    sum+=remainder;
                    div= div/10;
                }
                ans=sum;
            }
            System.out.println(ans);
        }
    }
}
