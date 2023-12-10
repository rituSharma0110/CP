package com.company;

import java.util.Scanner;

public class NotShading {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
       out: while (tc-->0){
            int rows= scanner.nextInt();
            int cols = scanner.nextInt();
            int reqRow = scanner.nextInt()-1;
            int reqCol = scanner.nextInt()-1;
            char [][] array = new char[rows][];
            for(int i =0;i<rows;i++){
                array[i] = scanner.next().toCharArray();
            }
            if (array[reqRow][reqCol] == 'B') {
                System.out.println(0);
                continue;
            }

            for (int i =0;i<cols;i++){
                if (array[reqRow][i]=='B'){
                    System.out.println(1);
                    continue out;
                }
            }
            for (int i=0;i<rows;i++){
                if (array[i][reqCol]=='B'){
                    System.out.println(1);
                    continue out;
                }
            }


            for (int i=0;i<rows;i++){
                for (int j =0;j<cols;j++){
                    if (array[i][j]=='B'){
                        System.out.println(2);
                        continue out;
                    }
                }
            }

            System.out.println(-1);
        }
    }
}
