package com.company;

import java.util.Scanner;

public class Problem1490A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            int count =0;
            for (int i =1;i< array.length;i++){
                int max = Math.max(array[i-1],array[i] );
                int min = Math.min(array[i-1],array[i] );
                while (min * 2 < max) {
                    count++;
                    min *= 2;
                }
            }
            System.out.println(count);
        }
    }


}
