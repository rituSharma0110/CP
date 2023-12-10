package com.company;

import java.util.*;

public class Problem1686B {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-- > 0) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            int cnt = 0;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    cnt++;
                    i++;
                }
            }
            System.out.println(cnt);
        }

    }
}
