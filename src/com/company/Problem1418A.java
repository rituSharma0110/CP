package com.company;

import java.util.Scanner;

public class Problem1418A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int xi =0;
            int yi=0;
            String str = scanner.next();
            char[] array = str.toCharArray();
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 'U' && yi<y) {
                    yi++;
                } else if (array[i] == 'D' && yi>y) {
                    yi--;
                } else if (array[i] == 'R' && xi<x) {
                    xi++;
                } else if (array[i]=='L' && xi>x)xi--;
            }

            if (xi==x && yi ==y){
                System.out.println("YES");
            }else System.out.println("NO");

        }
    }
}
