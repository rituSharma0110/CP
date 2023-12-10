package com.company;

import java.util.Scanner;

public class Problem1515B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            if (n%2!=0){
                System.out.println("NO");
                continue;
            }
            if (n%2==0){
                int var = n/2;
                boolean isPossible = isSquare(var);
                if (isPossible){
                    System.out.println("YES");
                    continue;
                }
            }
            if (n%4==0){
                int var = n/4;
                boolean isPossible = isSquare(var);
                if (isPossible){
                    System.out.println("YES");
                    continue;
                }
            }
            System.out.println("NO");
        }
    }

    public static boolean isSquare(int n ){
        int var =(int) Math.sqrt(n);

        return var*var== n;

    }

}
