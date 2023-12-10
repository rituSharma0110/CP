package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1526A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size*2];
            for (int i=0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            Arrays.sort(array);

            for (int i=0;i<array.length/2;i++){
                System.out.print(array[i] + " " + array[i+ (size)] + " ");
            }
            System.out.println();
        }
    }
}
