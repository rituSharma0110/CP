package com.company;

import java.util.Scanner;

public class Problem1538B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size];
            int sum =0;
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
                sum += array[i];
            }
            if (sum% array.length!=0){
                System.out.println(-1);
                continue;
            }
            int num = sum/ array.length;
            int count =0;
            for (int i =0;i< array.length;i++){
                if (array[i]>num){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
