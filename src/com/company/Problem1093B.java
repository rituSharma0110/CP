package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1093B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            String str = scanner.next();
            char[] array = str.toCharArray();
            Arrays.sort(array);
            if (array[0]==array[str.length()-1]){
                System.out.println(-1);
            }else {
                for (int i =0;i< array.length;i++){
                    System.out.print(array[i]+"");

                }
                System.out.println();
            }

        }

    }
}
