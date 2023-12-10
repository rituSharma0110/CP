package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1512A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size];
            int count =0;
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            int num = Integer.MAX_VALUE;
            for (int i =0;i< array.length-1;i++) {
                for (int j=i+1;j< array.length;j++) {
                    if (array[i] == array[j]) {
                        num = array[i];
                    }
                }
            }
           int[] newArray = new  int[array.length];
            for (int i=0;i< array.length;i++){
                newArray[i]= num;
            }

            for (int i =0;i< array.length;i++){
                if (newArray[i]!=array[i]){
                    System.out.println(i+1);
                }
            }


         }
    }
}
