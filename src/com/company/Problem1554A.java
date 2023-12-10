package com.company;

import java.util.Scanner;

public class Problem1554A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            long max = 0;
            for (int i =0;i< array.length-1;i++){
                max = ((Math.max((long) Math.max(array[i], array[i + 1]) * Math.min(array[i],array[i+1]),max )));
            }
            System.out.println(max);
        }
    }
}
