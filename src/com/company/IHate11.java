package com.company;

import java.util.Scanner;

public class IHate11 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            int number = scanner.nextInt();
            String ans = "NO";
            for (int i =0;i<20;i++){
                if (number%11==0){
                    ans = "YES";
                }
                number = number-111;
                if (number<0){
                    break;
                }
            }
            System.out.println(ans);
        }}}
