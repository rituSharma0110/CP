package com.company;

import java.util.Scanner;

public class Problem1547A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int xA = scanner.nextInt();
            int yA = scanner.nextInt();
            int xB = scanner.nextInt();
            int yB = scanner.nextInt();
            int xF = scanner.nextInt();
            int yF = scanner.nextInt();
            int ans = 0;
            if (((xA<xF && xF<xB) || (xB<xF && xF<xA)) && (yA == yF && yB == yF)) {
                ans = Math.abs(xB - xA) + 2;
            } else if (((yF>yA && yB>yF)|| (yB<yF && yF<yA)) && (xA==xF && xB==xF)) {
                    ans = Math.abs(yA - yB) + 2;
                } else {
                    ans = Math.abs(xB - xA) + Math.abs(yB - yA);
                }

            System.out.println(ans);
        }
    }
}
