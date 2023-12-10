package com.company;

import java.util.Scanner;

public class Problem1541A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int number = scanner.nextInt();
            if (number==3){
                System.out.println(3 + " " + 1 + " " + 2);
                continue;
            }
            if (number%2==0) {
                for (int i = 1;i<=number;i++){
                   if (i%2==0){
                       System.out.print((i-1) + " ");
                   }else System.out.print((i+1) + " ");
                }
            }else {
                for (int i =1;i<number-1;i++) {
                    if (i%2==0){
                        System.out.print((i-1) + " ");
                    }else System.out.print((i+1) + " ");
                }
                System.out.print(number + " ");
                System.out.print(number-2);
            }
            System.out.println();
        }
    }
}
