package com.company;

import java.util.Scanner;

public class Problem915A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scanner.nextInt();
        int length = scanner.nextInt();
        int [] array = new int[size];
        for (int i =0;i< array.length;i++){
            array[i] = scanner.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i =0;i< array.length;i++){
            if (length%array[i]==0){
                max = Math.max(max,array[i]);
            }
        }
        int ans = length/max;
        System.out.println(ans);

    }
}
