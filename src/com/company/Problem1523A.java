package com.company;

import java.util.Scanner;

public class Problem1523A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int iterations = scanner.nextInt();
            String string = scanner.next();
            char [] array = string.toCharArray();
            char [] newArray = array.clone();
            while (iterations>0) {
                for (int i = 0; i < array.length - 2; i++) {
                    if (array[i] == '1' && array[i + 1] == '0' && array[i + 2] == '1') {
                        newArray[i+1]='0';
                    } else if (array[i] == '0' && array[i + 1] == '1') {
                        newArray[i] = '1';
                    } else if (array[i] == '1' && array[i + 1] == '0') {
                        newArray[i+1] = '1';
                    }else if (i>1) {
                     if (newArray[i - 1] == '1' && array[i] == 0) {
                            newArray[i] = '1';
                        }
                    }
                }
                iterations--;
            }
            System.out.println(newArray);
        }

    }
}
//  unsolved .. better luck next time
