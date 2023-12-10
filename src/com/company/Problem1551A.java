package com.company;

import java.util.Scanner;

public class Problem1551A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int number = scanner.nextInt();
            long ans =0;
            long ans1 =0;
            long div = number/3;
            if (number%3==0){
                ans = number/3;
                ans1 = number/3;
                System.out.println(ans + " " + ans1);
                continue;
            }
            if ((div + (div+1)*2)==number){
                ans = div;
                ans1 = div+1;
            }else {
                ans = div+1;
                ans1 = div;
            }
            System.out.println(ans + " " + ans1);
        }
    }
}
