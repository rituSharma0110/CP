package com.company;
import java.util.*;

public class Problem1244B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            int length = scanner.nextInt();
            char[] array = scanner.next().toCharArray();
            int max = length;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == '1') {
                    int ans = Math.max(((i + 1) * 2), ((length - i) * 2));
                    max = Math.max(max, ans);
                }
            }
            System.out.println(max);
        }
    }
}
