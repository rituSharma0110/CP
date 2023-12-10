package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1607C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            Long [] array = new Long[size];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextLong();
            }
            Arrays.sort(array);
            Long min = array[0];
            for (int i =0;i< array.length-1;i++){
                min = Math.max(min,(array[i+1]-array[i]));
            }
            System.out.println(min);

        }

    }



}
