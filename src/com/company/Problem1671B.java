package com.company;
import java.util.*;

public class Problem1671B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            if (array[array.length - 1] - array[0] - n + 1 <= 2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
