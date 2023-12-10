package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem1514A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int[] array = new int[size];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            boolean isPerfect = perfectSquare(array);
            if (isPerfect){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }


        }
    }
    static boolean perfectSquare(int [] array ){
        boolean isPrft = false;
        for (int i =0;i< array.length;i++) {
            double sqrt =  Math.sqrt(array[i]);

            if (sqrt == (int)sqrt){
                isPrft = true;
            }else {
                isPrft = false;
                break;
            }

        }
        return isPrft;
    }

}
