package com.company;

import java.util.Scanner;

public class Problem1539A {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int tc= scanner.nextInt();
        while (tc-- > 0) {
            long n = scanner.nextLong();
            long x = scanner.nextLong();
            long k = scanner.nextLong();
            long per = k / x;
            if (per > n)
                per = n;
            long count = 0;
            count += (n - per) * per;
            count += ((per) * (per - 1)) / 2;
            System.out.println(count);
        }
    }
}
