package com.company;

import java.util.Scanner;

public class Problem1530B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();
            if (rows % 2 == 0) {
                for (int i = 1; i <= rows; i++) {
                    if (i == 1 || i == rows) {
                        for (int j = 1; j <= cols; j++) {
                            System.out.print(j % 2);
                        }
                        System.out.println();
                    } else if (i % 2 != 0 && i < (rows - 2)) {
                        for (int j = 1; j <= cols; j++) {
                            if (j == 1 || j == cols) {
                                System.out.print(1);
                            } else {
                                System.out.print(0);
                            }
                        }
                        System.out.println();
                    } else {
                        for (int j = 1; j <= cols; j++) {
                            System.out.print(0);
                        }
                        System.out.println();
                    }
                }
            } else {
                for (int i = 1; i <= rows; i++) {
                    if (i == 1 || i == rows) {
                        for (int j = 1; j <= cols; j++) {
                            System.out.print(j % 2);
                        }
                        System.out.println();
                    }else {
                        if (i%2==0){
                            for (int j =1;j<=cols;j++){
                                System.out.print(0);
                            }
                            System.out.println();
                        }else {
                               for (int j =1;j<=cols;j++){
                                   if (j==1 || j==cols) {
                                       System.out.print(1);
                                   }else {
                                       System.out.print(0);
                                   }
                               }
                            System.out.println();
                        }
                    }

                }

            }
        }
    }
}
