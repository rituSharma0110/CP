package com.company;

import java.util.Scanner;

public class WrongSub {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int number = scanner.nextInt();
        int k = scanner.nextInt();
        while (k>0){
            if (number%10==0){
                number /=10;

            }else {
                number -= 1;
            }
            k--;
        }
        System.out.println(number);

    }
}
