package com.company;

import java.util.Scanner;

public class Problem1549A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int number = scanner.nextInt();
            int x = 0;
            if (number==5){
                System.out.println(2 + " " + 4);
                continue;
            }
            System.out.println(2 + " " + number/2);
        }
    }
}
