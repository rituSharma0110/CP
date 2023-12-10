package com.company;

import java.util.Scanner;

public class Problem1509A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while(tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size];
            int odd = 0;
            int even = 0;
            for (int  i =0;i< array.length;i++){
                array[i]= scanner.nextInt();
                if (array[i]%2!=0) {
                    System.out.print(array[i] + " ");
                }
            }
            for (int i =0;i< array.length;i++){
                if (array[i]%2==0){
                    System.out.print(array[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
