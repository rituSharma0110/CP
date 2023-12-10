package com.company;

import java.util.Scanner;

public class Problem801B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String a = scanner.next();
        String b = scanner.next();
        int min =0;
        boolean isPossible = true;
        StringBuilder sbr = new StringBuilder("");
        for (int i =0;i<a.length();i++){
            min = Math.min((int)a.charAt(i),(int )b.charAt(i));
            sbr.append((char) min);
            isPossible = true;

            if (a.charAt(i)<b.charAt(i)){
                isPossible = false;
                break;
            }
        }
        if (isPossible){
            System.out.println(sbr);
        }else System.out.println(-1);
    }
}
