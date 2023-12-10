package com.company;

import java.util.Scanner;

public class ABC {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            String string = scanner.next();
            if (size==1){
                System.out.println("YES");
                continue;
            }
            if (size==2){
                if (string.contains("01") || string.contains("10")){
                    System.out.println("YES");
                    continue;
                }else {
                    System.out.println("NO");
                     continue;
                }
            }
            if (size>=3){
                System.out.println("NO");
            }
        }

    }
}
