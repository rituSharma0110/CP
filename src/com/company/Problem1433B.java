package com.company;

import java.util.Scanner;

public class Problem1433B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size];
            int left = 0;
            int right =0;
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            for (int i =0;i< array.length;i++){
               if (array[i]==1){
                   left = i;
                   break;
               }
            }
            int j = left;
            for (int i = array.length-1;i>j;i--){
                if (array[i]==1){
                    right= i;
                    break;
                }
            }
            int cnt =0;
            for (int i =left;i<=right;i++){
                if (array[i]==0){
                    cnt++;
                }
            }
            System.out.println(cnt);

        }

    }
}
