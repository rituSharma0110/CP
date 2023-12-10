package com.company;

import java.util.Scanner;

public class EduCode122A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int number = scanner.nextInt();
            if (number%7==0){
                System.out.println(number);
            }else {
                int ans =0;
                int rem = number%7;
                int lastDigit = number%10;
                if (lastDigit>=7){
                    ans= number -rem;
                    System.out.println(ans);
                }else if (lastDigit<=3){
                    int val = 7-rem;
                    ans = number+val;
                    System.out.println(ans);
                }else {
                    int last = number%10;
                    if (last>=rem){
                        System.out.println(number-rem);
                    }else {
                        int val = 7-rem;
                        System.out.println(number + val);
                    }
                }

            }

        }
    }
}
