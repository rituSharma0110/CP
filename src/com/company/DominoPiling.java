package com.company;

import java.util.Scanner;

public class DominoPiling {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int val = m*n;
        int ans = val/2;
        System.out.println(ans);
    }
}
