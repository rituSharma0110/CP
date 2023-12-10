package com.company;

import java.util.Scanner;

public class BeautifulYear {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int year = scanner.nextInt();

        while (true){
            year ++;
            int a = year/1000;
            int b = year/100%10;
            int c = year/10%10;
            int d = year%10;
        if (a!=b && b!=c && c!=d && a!=d && a!=c && b!=d ) {
            break;
        }
        }
        System.out.println(year);
        System.exit(0);
    }
}
