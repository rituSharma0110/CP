package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1552A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            String string = scanner.next();
            char [] array = string.toCharArray();
            Arrays.sort(array);
            int count =0;
            for (int i =0;i<string.length();i++){
                if (string.charAt(i)!=array[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
