package com.company;

import java.util.Scanner;

public class Problem1657A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x==0 && y==0){
                System.out.println(0);
                continue;
            }
            int num = (int) Math.sqrt(x*x + y*y);
            if (num*num== x*x + y*y){
                System.out.println(1);
            }else System.out.println(2);


        }

    }
}
