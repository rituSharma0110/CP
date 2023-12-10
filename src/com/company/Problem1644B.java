package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1644B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int [] array = new int[n];
            int k =n;
            for (int i =0;i< array.length;i++){
                array[i] = k;
                k--;
            }
            for (int i =0;i< array.length;i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
            n-=1;
            int j = array.length-1;
            while (n-->0){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j--;
                for (int i =0;i< array.length;i++){
                    System.out.print(array[i] + " ");
                }
                System.out.println();
            }


        }
    }
}
