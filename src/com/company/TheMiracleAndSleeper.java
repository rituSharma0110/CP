package com.company;

import java.util.Scanner;

public class TheMiracleAndSleeper {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int half = second/2;
            if (half>= first && half<=second){
                System.out.println(second%(half+1));
            }else {
                System.out.println(second-first);
            }
        }

    }
}
