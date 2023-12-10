package com.company;

import java.util.Scanner;

public class Problem445B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int []a = new int[m];
        int []b = new int[m];
        int cnt = 1;
            for (int i =0;i<m;i++){
                a[i] = scanner.nextInt();
                b [i] = scanner.nextInt();
            }
            for (int i =0;i<m;i++){
               if (a[i]+1== b[i] || b[i]+1== a[i]){
                   cnt*=2;
               }

        }
        System.out.println(cnt);


    }
}
