package com.company;

import java.util.*;
public class Problem1617B {
    public  static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            if(n%2==0) {
                System.out.println(((n/2)-1)+" "+(n/2)+" "+1);
            }else {
                if (((n - 1) / 2) % 2 == 0) {
                    System.out.println(((n / 2) - 1) + " " + ((n / 2) + 1) + " " + "1");
                } else {
                    System.out.println((((n - 1) / 2) + 2) + " " + (((n - 1) / 2) - 2) + " " + "1");
                }
            }
        }
    }
}
