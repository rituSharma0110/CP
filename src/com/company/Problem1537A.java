package com.company;

import java.util.Scanner;

public class Problem1537A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size];
            int sum =0;
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
                sum += array[i];
            }
            if (sum==size){
                System.out.println(0);
            }else if (sum<size){
                System.out.println(1);
            }else {
                System.out.println(sum-size);
            }

        }
    }
}
