package com.company;

import java.util.Scanner;

public class Problem1469B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int maxA =0;
            int maxB = 0;
            int sumA =0;
            int sumB= 0;
            int size1 = scanner.nextInt();
            int [] arrayA = new int[size1];
            for (int i =0;i< arrayA.length;i++){
                arrayA[i] = scanner.nextInt();
                sumA+=arrayA[i];
                maxA = Math.max(maxA,sumA);
            }
            int size2 = scanner.nextInt();
            int [] arrayB = new int[size2];
            for (int j =0;j< arrayB.length;j++){
                arrayB[j] = scanner.nextInt();
                sumB+=arrayB[j];
                maxB = Math.max(maxB,sumB);
            }

                System.out.println(maxA + maxB);

        }
    }
}
