package com.company;

import java.util.Scanner;

public class Problem1612B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int min = scanner.nextInt();
            int max = scanner.nextInt();
            if (size==2){
                if (min ==2){
                    System.out.print(2 + " " + 1);
                }else {
                    System.out.print(1+ " " + 2);
                }
                System.out.println();
                continue;
            }
            if ( min>(size/2+1) || max<(size/2)){
                System.out.println(-1);
                continue;
            }
            if (min<=size/2 && max<=size/2){
                System.out.println(-1);
                continue;
            }
            if (min>size/2 && max>size/2){
                System.out.println(-1);
                continue;
            }
            System.out.print(min+ " ");

            for (int i = size;i>0;i--){
               if (i!=min && i!=max){
                   System.out.print(i + " ");
               }

           }
            System.out.print(max + " ");
            System.out.println();


        }
    }
}
