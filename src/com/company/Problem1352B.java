package com.company;
import java.util.*;

public class Problem1352B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a < b) {
                System.out.println("NO");
                continue;
            }
            if ((a - b) % 2 == 0) {
                System.out.println("YES");
                for (int i = 0; i < b - 1; i++) {
                    System.out.print("1 ");
                }
                System.out.println(a - (b - 1));
                continue;
            }
            if (a < 2 * b) {
                System.out.println("NO");
                continue;
            }
            if ((a - 2 * b) % 2 == 0) {
                System.out.println("YES");
                for (int i = 0; i < b - 1; i++) {
                    System.out.print("2 ");
                }
                System.out.println(a - 2 * (b - 1));
                continue;
            }
            System.out.println("NO");
        }
    }
}
