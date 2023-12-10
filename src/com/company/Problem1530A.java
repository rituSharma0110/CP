package com.company;

import java.util.Scanner;

public class Problem1530A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            int number = scanner.nextInt();
            int max =0;
            while (number>0){
                int remainder = number%10;
                max = Math.max(max,remainder);
                number = number/10;
            }
            System.out.println(max);
        }
    }
}
