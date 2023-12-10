package com.company;

import java.util.Scanner;

public class BoboniuPlaysChes {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int originalRow = scanner.nextInt();
        int originalCol = scanner.nextInt();

        int currentRow = originalRow;
        int currentCol = originalCol;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println(currentRow + " " + currentCol);
                currentCol++;
                if (currentCol > column) {
                    currentCol = 1;
                }
            }
            currentRow++;
            currentCol--;
            if (currentCol==0){
                currentCol=column;
            }
            if (currentRow>row){
                currentRow=1;
            }
        }
    }
}

