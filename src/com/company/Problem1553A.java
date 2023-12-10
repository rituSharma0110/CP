package com.company;

import java.util.Scanner;

public class Problem1553A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
     outer:   while (tc-->0) {
         int number = scanner.nextInt();
         if (number > 1000) {
             int last3 = number % 100;
             int count = 0;
             for (int i = 1; i <= last3; i++) {
                 int lastDig = i % 10;
                 if (lastDig == 9) {
                     count++;
                 }
             }
             int x = number - last3;
             int rem = x / 100;
             int digits = digCount(x);

             if (digits <= 3) {
                 System.out.println(count);
                 continue;
             } else {
                 System.out.println(count + (10 * rem));
             }
         }else {
             int count =0;
             for (int i=1;i<=number;i++){
                 int lastDig = i%10;
                 if (lastDig==9){
                     count++;
                 }

             }
             System.out.println(count);
         }
     }
    }
    static int digCount (int number){
        int count =0;
        while (number>0){
            count++;
            number = number/10;
        }
        return count;
    }
}
