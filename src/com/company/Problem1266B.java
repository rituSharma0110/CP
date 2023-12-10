package com.company;

import java.util.Scanner;

public class Problem1266B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            long n = scanner.nextLong();
            long nDice = (n)/14 ;
            nDice--;
            long total = (nDice)*14;
            if ((n == total + (21-1) || n == total + (21-2) || n == total + (21-3) || n == total + (21-4) || n == total + (21-5)|| n == total + (21-6))
            && n>=14){
                System.out.println("YES");
            }else System.out.println("NO");

        }

    }

}
