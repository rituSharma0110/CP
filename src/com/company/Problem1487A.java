package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1487A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [ ] array = new int[size];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }

            Arrays.sort(array);
            int min = array[0];
            int count =0;
            for (int i =0;i< array.length;i++){
                if (array[i]>min){
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
