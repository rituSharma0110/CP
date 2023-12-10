package com.company;

import java.util.Scanner;

public class Problem25B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int length = scanner.nextInt();
        String str = scanner.next();
        if (length%2==0) {
            for (int i = 0; i < str.length(); i++) {
                if (i%2==0 && i!=0 ){
                    System.out.print('-');
                }
                System.out.print(str.charAt(i));
            }
        }else {
            for (int i = 0; i < str.length(); i++) {
                if (i%2==1 && i!=1){
                    System.out.print('-');
                }
                System.out.print(str.charAt(i));
            }
        }


    }
}
