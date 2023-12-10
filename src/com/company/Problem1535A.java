package com.company;

import java.util.Scanner;

public class Problem1535A {
    public static Scanner scanner  = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();

            int maxOfFirst = Math.max(a,b);
            int minOfFirst = Math.min(a,b);
            int maxOfSecond = Math.max(c,d);
            int minOfSecond = Math.min(c,d);
            if (maxOfSecond<minOfFirst){
                System.out.println("NO");
            }else if (maxOfFirst<minOfSecond){
                System.out.println("NO");
            }else System.out.println("YES");
        }
    }
}
