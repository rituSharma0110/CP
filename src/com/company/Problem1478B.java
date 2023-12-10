package com.company;

import java.util.Scanner;

public class Problem1478B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
       int size = scanner.nextInt();
       int lucky = scanner.nextInt();
       int[] array = new int[size];
           for (int i = 0; i < array.length; i++) {
               array[i] = scanner.nextInt();
           }

            for (int i = 0; i < array.length; i++) {
                if (array[i]%lucky==0 || array[i]%10==lucky){
                    System.out.println("YES");
                    continue;
                }
                if (array[i]>= lucky*10){
                    System.out.println("YES");
                    continue;
                }
                int secDiv = (array[i]/10)%10;
                if ( secDiv==lucky){
                    System.out.println("YES");
                    continue;
                }
                boolean is = false;
                while (true){
                    array[i]-=lucky;
                    if (array[i]<=0){
                        break;
                    }
                    if (array[i]%10==0){
                        System.out.println("YES");
                        is = true;
                        break;
                    }
                }
                if (!is){
                    System.out.println("NO");
                }
            }

        }
    }

}
