package com.company;

import java.util.Scanner;

public class Soldiers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initial = scanner.nextInt();
        long money = scanner.nextLong();
        int n = scanner.nextInt();
        int sum = n *(n+1)/2*initial;
        if (sum>=money) {
            long ans = sum - money;
            System.out.println(ans);

        }else System.out.println(0);

    }
}
