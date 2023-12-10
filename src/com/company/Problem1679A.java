package com.company;
import java.util.*;

public class Problem1679A {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc--> 0) {
            long n = scanner.nextLong();
            if (n % 2 == 1 || n < 4) {
                System.out.println(-1);
                continue;
            }
            long a = n / 4;
            long b = n / 6;
            if (n % 6 != 0) {
                b += 1;
            }
            System.out.println(b + " " + a);

        }
    }
}
