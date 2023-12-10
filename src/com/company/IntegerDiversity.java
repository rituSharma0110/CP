package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class IntegerDiversity {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            int size = scanner.nextInt();
            int count = 0;
            HashMap<Integer,Integer> map = new HashMap<>();
            int [] array = new int[size];
            for (int i =0;i< array.length;i++){
                array[i] =scanner.nextInt();

            }

        }
    }
}