package com.company;

import java.util.Scanner;

public class Problem1584B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            int row = scanner.nextInt();
            int column = scanner.nextInt();
            int ans = 0;
            int mul = row*column;
            if (mul%3==0){
                ans = mul/3;
            }else {
               ans= (mul/3)+1;
            }
            System.out.println(ans);
        }
    }
}
