package com.company;

import java.util.Scanner;

public class Problem1430C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            System.out.println(2);
            if (n==2){
                System.out.println(2 + " " + 1);
                continue;
            }
            System.out.println((n-2) + " " + n );
            System.out.println((n-1) + " "+ (n-1) );
            int j =3;
            int k = 1;
            for (int i =0;i<n-3;i++){
                System.out.println((n-j) + " " + (n-k));
                j++;
                k++;
            }
        }
    }
}
