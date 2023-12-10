package com.company;

import java.util.*;

public class Problem1542A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
      while (tc-->0) {
           int pair = scanner.nextInt();
           int oddCount =0;
           int evenCount =0;
           for (int i =0;i<2*pair;i++){
               int number = scanner.nextInt();
               if (number%2==0){
                   evenCount++;
               }else oddCount++;
           }
           if (evenCount==oddCount){
               System.out.println("Yes");
           }else System.out.println("No");
        }
    }
}