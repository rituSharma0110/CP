package com.company;

import java.util.Scanner;

public class NearlyLuckyNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        if(number/10==0){
            System.out.println("NO");
        }else {
            String ans = " ";
            int cnt =0;
            while (number > 0) {
                if (number % 10 == 7 || number % 10 == 4) {
                    cnt++;
                }
                number = number / 10;
            }
            if (cnt==4 || cnt==7) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
