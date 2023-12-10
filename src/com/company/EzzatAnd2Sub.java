package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class EzzatAnd2Sub {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            Arrays.sort(array);
            double sum = 0d;
            double average = 0d;
            for (int i =0;i< array.length-1;i++){
                average = (double) average + array[i];
            }
            average=(double)average/(array.length-1);
            sum = (double) (average + array[array.length-1]);
            System.out.printf("%8f\n" ,sum );
        }
    }
}
