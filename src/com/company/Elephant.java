package com.company;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int ans = number/5;
        if (number%5==0){
            System.out.println(ans);
        }else {
            System.out.println(ans + 1);
        }
    }
}
