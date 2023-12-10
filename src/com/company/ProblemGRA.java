package com.company;

import java.util.Scanner;

public class ProblemGRA {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int [size];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            String ans = "YES";
            for (int i =0;i< array.length-1;i++){
                if (array[i]>array[i+1]){
                    ans = "YES";
                    break;
                }else {
                    ans = "NO";
                }
            }
            System.out.println(ans);
        }
    }
}
