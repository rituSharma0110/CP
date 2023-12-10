package com.company;

import java.util.Scanner;

public class SumOfSubsequences {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int [] array = new int[7];
            for (int i =0;i<array.length;i++){
                array[i] = scanner.nextInt();
            }
           if (array[0] + array[1] == array[2]){
               System.out.println(array[0] + " " + array[1] + " " + array[3]);
           }else System.out.println(array[0] + " " + array[1] + " " + array[2]);

        }
    }
}
