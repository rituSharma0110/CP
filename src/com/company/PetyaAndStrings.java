package com.company;

import java.util.Scanner;

public class PetyaAndStrings {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
            String first = scanner.next();
            String second = scanner.next();
            int val =  first.compareToIgnoreCase(second);
            if (val<0){
                System.out.println(-1);
            }else if (val==0){
                System.out.println(0);
            }else System.out.println(1);
    }
}
