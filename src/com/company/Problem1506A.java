package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1506A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            Long number = scanner.nextLong();
            Long [][] array1 = new Long[n][m];
            long k =0;
            for (int i =0;i< array1.length;i++){
                for (int j =0;j<array1[i].length;j++){
                    array1[i][j] = k+1;
                    k++;
                }
            }
            Long [][] array2= new Long[n][m];
            long r = 0;
            for (int i =0;i< array1.length;i++){
                for (int j =0;j<array1[i].length;j++){
                    array2[i][j] = r+1;
                    r=r+3;
                }
                r=i+1;
            }
            for (int i =0;i< array1.length;i++){
                for (int j =0;j<array1[i].length;j++){
                    if (array2[i][j]==number){
                        System.out.println(array1[i][j]);
                        break;
                    }
                }
            }



        }

    }
}
// undone