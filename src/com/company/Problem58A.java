package com.company;

import java.util.Scanner;

public class Problem58A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String str = scanner.next();
        if (str.matches(".*h.*e.*l.*l.*o.*")){
            System.out.println("YES");
        }else System.out.println("NO");

    }
}
