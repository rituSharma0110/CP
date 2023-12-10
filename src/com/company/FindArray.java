package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class FindArray {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size];
            for (int i =0;i< array.length;i++){
                array[i]=i+2;
            }
            for (int i =0;i< array.length;i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
