package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class EquidistantLetters {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            String string = scanner.next();
            char[] array = string.toCharArray();
            Arrays.sort(array);
//            for (int i =0;i< array.length;i++){
//                for (int j = i;j< array.length-2;j++){
//                    if (array[i]==array[j]){
//                        char temp = array[i+2];
//                        array[i+2] = array[j];
//                        array[j] =temp;
//                        break;
//                    }
//                }
//            }

            String arrString = String.valueOf(array);
            System.out.println(arrString);
        }
    }
}
