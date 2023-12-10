package com.company;

import java.util.Scanner;

public class AndThenThereWereK {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int number = scanner.nextInt();
            int ans = 1;
            int count =number;
            while (number>0){
                ans = number&ans;
                count--;
                number --;
                if (ans ==0){
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
