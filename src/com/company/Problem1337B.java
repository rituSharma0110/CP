package com.company;

import java.util.Scanner;

public class Problem1337B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int h = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (b*10>=h){
                System.out.println("YES");
                continue;
            }

            while (a-->0){
                h = h/2 + 10;
            }
            while (b-->0){
                h = h-10;
            }

            if (h>0){
                System.out.println("NO");
            }else System.out.println("YES");
        }

    }
}
