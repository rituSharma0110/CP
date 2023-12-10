package com.company;

import java.util.Scanner;

public class Problem1543B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size];
            long sum =0;
            for (int i =0;i< array.length;i++){
                array[i]=scanner.nextInt();
                sum += array[i];
            }
            long extra = sum%size;
            long ans = extra * ( size - extra);
            System.out.println(ans);

        }
    }
}
