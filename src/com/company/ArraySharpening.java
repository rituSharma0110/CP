package com.company;

import java.util.Scanner;

public class ArraySharpening {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            long[] array = new long[size];
            for (int i =0;i< array.length;i++){
                array[i]= scanner.nextLong();
            }

            int p = -1;
            int s = size;
            for (int i =0;i< array.length;i++){
                if (array[i]<i){
                    break;
                }
                p = i;
            }
            for (int i =size-1;i>=0;i--){
                if (array[i]<(size-i-1)){
                    break;
                }
                s= i;
            }
            if (s<=p){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}
