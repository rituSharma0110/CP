package com.company;

import java.util.Scanner;

public class Problem1351B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            if ((a == c && b + d == a) || (a == d && b + c == a) || (b == c && a + d == b) || (b == d && a + c == b)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
