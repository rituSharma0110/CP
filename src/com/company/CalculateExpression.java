package com.company;

import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        if (n%2==0){
            System.out.println(n/2);
        }else {
            System.out.println(-1*(n+1)/2);
        }
    }
}
