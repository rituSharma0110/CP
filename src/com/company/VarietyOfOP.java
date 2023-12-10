package com.company;

import java.util.Scanner;

public class VarietyOfOP {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int diff = Math.abs(num1-num2);
            if (num1==num2 && num1==0){
                System.out.println(0);
                continue;
            }
            if (diff%2!=0){
                System.out.println(-1);
            }else {
                if ((num1 == num2)){
                    System.out.println(1);
                }else System.out.println(2);
            }
        }
    }
}
