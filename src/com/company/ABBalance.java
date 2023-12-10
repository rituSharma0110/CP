package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ABBalance {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            String string = scanner.next();
            char[] array = string.toCharArray();

            if (array[0]!= array[array.length-1]){
                array[0] = array[array.length-1];
            }
            System.out.println(array);
        }
    }
}
