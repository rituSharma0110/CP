package com.company;

import java.util.Scanner;

public class Problem1519A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a==1||b==1){
                if (Math.abs(b-a)<=c){
                    System.out.println("YES");
                }else System.out.println("NO");
                continue;
            }
            if(c==0){
                if(a==b){
                    System.out.println("YES");
                }else System.out.println("NO");
                continue;
            }
            int max = Math.max(a,b);
            int min = Math.min(a,b);
            int n = max/min;
            int x = Math.abs(n - min);
            if (x>c){
                System.out.println("NO");
            }else System.out.println("YES");
        }
    }
}
