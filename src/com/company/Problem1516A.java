package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1516A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int m = scanner.nextInt();
            int [] array = new int[size];
            for (int i=0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            int i =0;
            while (m>0){
                    if (array[i]!=0){
                        array[i]--;
                        array[array.length-1]++;
                        m--;

                    }else if (array[i]==0){
                        i++;
                    }
                    if (i== array.length-1){
                        break;
                }
            }
            for (int j =0;j< array.length;j++){
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }

    }
}
