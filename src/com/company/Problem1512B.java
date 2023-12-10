package com.company;
import java.util.*;

public class Problem1512B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        scanner.nextLine();
        while(tc-->0){
            int n = scanner.nextInt();
            scanner.nextLine();
            int firstRow =-1;
            int secondRow =-1;
            int firstCol =-1;
            int secondCol =-1;
            char[][] array = new char[n][n];
            for (int i =0;i<n;i++){
               array[i] = scanner.next().toCharArray();
            }
            for (int i =0;i<n;i++){
                for (int j =0;j<n;j++){
                    if(array[i][j]=='*'){
                        if (firstRow==-1) {
                            firstRow = i;
                            firstCol = j;
                        }else {
                            secondRow=i;
                            secondCol=j;
                        }
                    }
                }
            }


            if (n==2){
                for (int i =0;i<n;i++){
                    for (int j =0;j<n;j++){
                        System.out.print('*');
                    }
                    System.out.println();
                }
                continue;
            }
            if (firstRow==secondRow){
                if (firstRow==n-1){
                    array[0][firstCol]='*';
                    array[0][secondCol]='*';
                }else {
                    array[n-1][firstCol]='*';
                    array[n-1][secondCol]='*';
                }
            }else if (secondCol==firstCol){
                if (firstCol==n-1){
                    array[firstRow][0]='*';
                    array[secondRow][0]='*';
                }else {
                    array[firstRow][n-1]='*';
                    array[secondRow][n-1]='*';
                }
            }else {
                array[secondRow][firstCol]='*';
                array[firstRow][secondCol]='*';
            }

            for (int i =0;i<n;i++){
                for (int j =0;j<n;j++){
                    System.out.print(array[i][j]);
                }
                System.out.println();
            }

        }
    }

}
