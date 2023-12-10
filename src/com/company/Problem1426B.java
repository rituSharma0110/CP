package com.company;

import java.util.Scanner;

public class Problem1426B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int a=0;
            int b =0;
            int c =0;
            int d =0;
            boolean symmetric = false;
            for (int i =1;i<=n;i++){
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
                d = scanner.nextInt();
                if (b==c){
                    symmetric = true;
                }
            }
            if (m%2!=0){
                System.out.println("NO");
                continue;
            }

            if (symmetric){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}
