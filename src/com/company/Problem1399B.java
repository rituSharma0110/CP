package com.company;

import java.util.Scanner;

public class Problem1399B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] arrayA = new int[size];
            int [] arrayB = new int[size];
            int minA = Integer.MAX_VALUE;
            int minB = Integer.MAX_VALUE;
            for (int i =0;i< arrayA.length;i++){
                arrayA[i] = scanner.nextInt();
                minA = Math.min(minA,arrayA[i]);
            }
            for (int i =0;i< arrayA.length;i++){
                arrayB[i] = scanner.nextInt();
                minB = Math.min(minB,arrayB[i]);

            }
            long cnt =0;
            for (int i =0;i< arrayA.length;i++) {
                cnt+= Math.max(arrayA[i]-minA,arrayB[i]-minB);
            }
            System.out.println(cnt);


        }

    }
}
