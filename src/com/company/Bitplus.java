package com.company;

import java.util.Scanner;

public class Bitplus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int x =0;
        while (num-->0) {
            String str = scanner.next();
            if (str.contains("++")) {
                x +=1;
            }else {
                x -=1;
            }
        }
        System.out.println(x);
    }
}
