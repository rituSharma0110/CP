package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1106C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scanner.nextInt();
        int [] array = new int[size];
        for (int i = 0;i< array.length;i++){
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        long sum =0;
        for (int i =0;i<array.length/2;i++){
            long var = array[i] + array[size-i-1];
            sum += Math.pow(var,2);
        }
        System.out.println(sum);

    }
}
