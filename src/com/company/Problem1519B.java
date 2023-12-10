package com.company;

import java.util.Scanner;

public class Problem1519B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int burles = scanner.nextInt();
            if((x*y-1)==burles){
                System.out.println("YES");
            }else System.out.println("NO");


        }
    }
}
