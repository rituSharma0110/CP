package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Taxi {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scanner.nextInt();
        int[] a = new int[5];
        for(int i = 0; i < size; i++) {
            a[scanner.nextInt()]++;
        }

        int count = a[4];
        count += a[3];
        a[1] = Math.max(0, a[1] - a[3]);
        count += a[2] / 2;
        if(a[2] % 2 == 1) {
            a[1] += 2;
        }

        count += a[1] / 4 + (a[1] % 4 == 0 ? 0 : 1);
        System.out.println(count);
    }
}
