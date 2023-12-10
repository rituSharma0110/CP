package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1654A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            Long [] array = new Long[size];
            for (int i =0;i<array.length;i++){
                array[i]= scanner.nextLong();
            }
            Arrays.sort(array);
            long sum = array[size-1]+ array[size-2];
            System.out.println(sum);
        }
    }
}
