package com.company;

import java.util.Scanner;

public class Problem266B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scanner.nextInt();
        int t = scanner.nextInt();
        String str = scanner.next();
        char [] array = str.toCharArray();
        while (t-->0) {
            for (int i = 0; i < size - 1; i++) {
                if (array[i] == 'B' && array[i + 1] == 'G') {
                    char temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    i++;
                }
            }
        }
        for (int i =0;i< array.length;i++){
            System.out.print(array[i] + "");
        }

    }
}
