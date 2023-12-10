package com.company;

import java.util.Scanner;

public class SquareString {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            String string = scanner.next();
            char[] array = string.toCharArray();
            if (array.length%2!=0){
                System.out.println("NO");
                continue;
            }
            boolean isSquare = true;
            for (int i =0;i<string.length()/2;i++) {
                if (array[i] != array[array.length/2 +i]) {
                    isSquare=false;
                    break;
                }else isSquare=true;
            }
            if (isSquare){
                System.out.println("YES");
            }else System.out.println("NO");

        }
    }
}
