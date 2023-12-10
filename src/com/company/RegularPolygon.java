package com.company;

import java.util.Scanner;

public class RegularPolygon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            if (n%m==0){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}
