package com.company;

import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 50;
        int val =0;
       for (int i =0;i<=49;i++){
           System.out.println((i) + " & " + (i+1) + " : " + (i&(i+1)));
       }
    }
}
