package com.company;

import java.util.Scanner;

public class UltraFastMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        for (int i =0;i<a.length();i++){
            if (a.charAt(i)!=b.charAt(i)){
                System.out.print("1");
            }else System.out.print("0");
        }
        System.out.println();
    }

}
