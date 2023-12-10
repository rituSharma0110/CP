package com.company;

import java.util.Scanner;

public class Problem1455B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int point = scanner.nextInt();
            int a =0;
            int cnt =0;
            while ((a*(a+1)/2)<point){
                a++;
            }
            if ((a*(a+1)/2)==point+1){
                a+=1;
            }

            System.out.println(a);
        }
    }
}
