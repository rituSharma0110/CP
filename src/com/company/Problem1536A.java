package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1536A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            int size = scanner.nextInt();
            int[] array = new int[size];
            int negativeCount = 0;
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
                if (array[i] < 0) {
                    negativeCount++;
                }
            }
            if (negativeCount > 0) {
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");

            System.out.println("101");
            for (int i =0;i<101;i++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
