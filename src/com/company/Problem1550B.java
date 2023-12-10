package com.company;

import java.util.Scanner;

public class Problem1550B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scanner.nextInt();
        while(t-- > 0) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            String str = scanner.next();
            int ans = n * a;
            int var = 0;
            for (int i = 1; i < n; i++) {
                if (str.charAt(i) != str.charAt(i - 1)) {
                    var++;
                }
            }
            if (b >= 0) {
                ans += n * b;
            } else {
                int k = 0;
                if (var % 2 == 0) {
                    k = var / 2 + 1;
                } else {
                    k = (var + 1) / 2 + 1;
                }
                ans += k * b;
            }
            System.out.println(ans);
        }
    }
}
