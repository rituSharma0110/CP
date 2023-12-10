package com.company;

import java.util.Scanner;

public class Problem131A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String str = scanner.next();
        char[] array = str.toCharArray();
        boolean y = true;
        for (int i =1;i< array.length;i++){
            if (Character.isLowerCase(array[i])){
                y = false;
            }
        }
        if(y) {
            String str1 = str.toLowerCase();
            array = str1.toCharArray();
            array[0] = (char) (array[0] - (char) 32);
        }

        for (int i =0;i< array.length;i++){
            System.out.print(array[i]+"");
        }
    }
}
