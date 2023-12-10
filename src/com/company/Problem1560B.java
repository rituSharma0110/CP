package com.company;

import java.util.Scanner;

public class Problem1560B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            long total = 2L *Math.abs(a-b);
            if (total<Math.max(a,b)||total<c){
                System.out.println(-1);
            }else {
                long d = total/2+c;
                if (d>total){
                    d-=total;
                }
                System.out.println(d);
            }

        }

    }
}
