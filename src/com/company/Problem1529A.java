package com.company;

import java.util.Scanner;

public class Problem1529A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int[] array = new int[size];
            int count =0;
            int min = 0;
            for (int i =0;i<array.length;i++){
                array[i]=scanner.nextInt();
                }
            min =minimum(array);
            for (int i =0;i< array.length;i++){
                if (array[i]>min){
                    count++;
                }
            }

            System.out.println(count);
        }
    }
    static int minimum (int [] array){
        int min = array[0];
        for (int i=0;i< array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        return min;
    }

}
