package com.company;
import java.util.*;

public class Problem1659A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            int n = scanner.nextInt();
            int r = scanner.nextInt();
            int b = scanner.nextInt();
            while (b > 0) {
                int len = (int) Math.ceil((double) r / (b + 1));
                for (int i = 0; i < len; i++) {
                    System.out.print("R");
                }
                System.out.print("B");
                b--;
                r -=len;
            }
            while (r > 0) {
                System.out.print("R");
                r--;
            }
            System.out.println();
        }
    }
}
