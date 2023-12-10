package com.company;

import java.util.Scanner;

public class Problem1521A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            Long a = scanner.nextLong();
            Long b = scanner.nextLong();
            if (b==1){
                System.out.println("NO");
            }else {
                System.out.println("YES");
                System.out.println(a + " " + a*b + " " + a*(b+1));
            }
        }

    }

}
