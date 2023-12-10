package com.company;

import java.util.Scanner;

public class YoungPhysicist {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
          int a =0;
          int b =0;
          int c =0;
        while (n-->0){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();

            a+=x;
            b+=y;
            c+=z;
        }
        if (a==0 && b==0 && c==0){
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
