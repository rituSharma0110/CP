package com.company;

import java.util.Scanner;

public class Problem709A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        int d = scanner.nextInt();
        int [] array = new int[n];
        for (int i =0;i< array.length;i++){
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        int cnt =0;
        for (int i =0;i< array.length;i++){
            if (array[i]>b){
                continue;
            }else {
                sum+=array[i];
            }

            if (sum>d){
                cnt++;
                sum=0;
            }
        }
        System.out.println(cnt);
    }
}
