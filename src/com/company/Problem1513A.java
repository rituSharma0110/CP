package com.company;

import java.util.Scanner;

public class Problem1513A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int peaks = scanner.nextInt();
            if (peaks==0){
                for (int i =0;i<size;i++){
                    System.out.print(i+1 + " ");
                }
                System.out.println();
                continue;
            }
            if (size<=2*peaks){
                System.out.println(-1);
                continue;
            }

            int j = size;
            int k = 1;
            int n = peaks;
            for (int i =1;i<=size;i++){
                if (i%2!=0){
                    System.out.print(k + " ");
                    k++;
                }else {
                    System.out.print(j + " ");
                    j--;
                    peaks--;
                }
                if (peaks==0){
                    break;
                }
            }
            for (int i = n+1;i<=size-n;i++ ){
                System.out.print(i + " ");
            }
            System.out.println();


    }}

}
