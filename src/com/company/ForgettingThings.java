package com.company;

import java.util.Scanner;

public class ForgettingThings {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = b*10 +2;
        if (a + 1 == b){
            System.out.println(a + " " + b);
        }else if (a == b){
            System.out.println(a*10+ 1 + " " + c);
        }else if (a==9 && b ==1){
            System.out.println(9 + " " + 10);
        }else System.out.println(-1);
    }

}
