package com.company;

import java.util.Scanner;

public class Problem662B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String str = scanner.next();
        int n = scanner.nextInt();
        int h = Integer.parseInt(str.substring(0,2));
        int m = Integer.parseInt(str.substring(3,5));
        m += h * 60;
        m += n;
        m = m % (24 * 60);
        System.out.printf("%02d:%02d\n", m / 60, m % 60);
    }
}
