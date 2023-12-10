package com.company;

import java.util.Scanner;

public class Problem1497C1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int total = scanner.nextInt();
            int k = scanner.nextInt();
            if (total%2==0){
               if ((total/2)%2==0){
                   System.out.print(total/2 + " ");
                   total/=2;
                   total/=2;
                   System.out.print(total + " ");
                   System.out.print(total + " ");
                   System.out.println();
               }else {
                   System.out.print(total/2-1 + " ");
                   System.out.print(total/2-1 + " ");
                   System.out.print(2);
                   System.out.println();
               }
            }else {
                for (int i =0;i<k-1;i++){
                    System.out.print((total/2) + " ");
                }
                System.out.print(1);
                System.out.println();
            }
        }
    }
}
