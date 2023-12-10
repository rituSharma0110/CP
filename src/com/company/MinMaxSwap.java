package com.company;

import java.util.Scanner;

public class MinMaxSwap {
    public static Scanner scanner  = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] arrayA = new int[size];
            int [] arrayB = new int[size];
            for (int i =0;i<arrayA.length;i++){
                arrayA[i] = scanner.nextInt();
            }
            for (int j =0;j<arrayB.length;j++){
                arrayB[j] = scanner.nextInt();
            }
            int maxA = maximum(arrayA);
            int maxB = maximum(arrayB);
            int indexA = maximumIndex(arrayA);
            int indexB = maximumIndex(arrayB);
            if (maxA>maxB || maxA==maxB ){
                for (int i =0;i<arrayA.length;i++){
                        if (arrayB[i]>arrayB[indexA]){
                            if (arrayB[i]>arrayA[i]){
                                int temp = arrayA[i];
                                arrayA[i] = arrayB[i];
                                arrayB[i] = temp;
                            }
                    }
                }
            }else if (maxA<maxB ){
                for (int i =0;i<arrayA.length;i++){
                    if (arrayA[i]>arrayA[indexB]){
                        if (arrayA[i]>arrayB[i]){
                            int temp = arrayA[i];
                            arrayA[i] = arrayB[i];
                            arrayB[i] = temp;
                        }
                    }
                }

            }
            int maximumA = 0;
            int maximumB = 0;
            for (int i =0;i< arrayA.length;i++){
                maximumA = Math.max(arrayA[i],maximumA );
            }
            for (int i =0;i< arrayB.length;i++){
                maximumB = Math.max(arrayB[i],maximumB );
            }
            System.out.println(maximumA*maximumB);
        }
    }
    static int maximum(int [] array ){
        int max = array[0];
        for (int i =0;i< array.length;i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
    static int maximumIndex(int [] array ){
        int max = 0;
        for (int i =0;i< array.length;i++){
            if (array[i]>array[max]){
                max =i;
            }
        }
        return max;
    }
}
