package com.company;

import java.util.Scanner;

public class MakeAP {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if ((2*b-c)>0 && (2*b-c)%a==0) {
                System.out.println("YES");
            }else if ((c+a)>0 && (c +a)%(2*b)==0){
                System.out.println("YES");
            }else if ((2*b-a)>0 && (2*b-a)%c==0){
                System.out.println("YES");
            }else System.out.println("NO");

        }
    }
}
