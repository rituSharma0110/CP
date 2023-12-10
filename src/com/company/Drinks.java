package com.company;

import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        double sum =0;
        double var =0;
        for (int i =0;i< array.length;i++){
            array[i] = scanner.nextInt();
             var = array[i];
            sum +=var;
        }
        double ans = sum/n ;
        System.out.printf("%4f" , ans);
    }
}
