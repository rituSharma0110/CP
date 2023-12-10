package com.company;

import java.util.Scanner;

public class Word {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
         String str = scanner.next();
         char [] array = str.toCharArray();
         int cntl = 0;
         int cntu = 0;
         for (int i =0;i< array.length;i++){
             if (array[i]>=65 && array[i]<=90){
                 cntu++;
             }else cntl++;
         }
         if (cntl==cntu){
             System.out.println(str.toLowerCase());
         }else if (cntl>cntu){
             System.out.println(str.toLowerCase());
         }else System.out.println(str.toUpperCase());
    }
}
