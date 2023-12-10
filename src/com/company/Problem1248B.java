package com.company;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Problem1248B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scanner.nextInt();
        int [] array = new int[size];
        for (int i =0;i<size;i++){
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        BigInteger sumA = BigInteger.valueOf(0);
        BigInteger sumB = BigInteger.valueOf(0);
        for (int i =0;i< array.length/2;i++){
           sumA=sumA.add(BigInteger.valueOf(array[i]));
        }
        for (int i = array.length/2;i< size;i++){
            sumB = sumB.add(BigInteger.valueOf(array[i]));
        }
        BigInteger sum = BigInteger.valueOf(0);
        sum=sum.add(sumA.pow(2));
        sum=sum.add(sumB.pow(2));
        System.out.println(sum);

    }
}
