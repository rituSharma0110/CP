package com.company;
import java.util.*;

public class Problem1665A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            if (n==4){
                System.out.println(1 + " " + 1 + " " + 1 + " " + 1);
                continue;
            }

                int c = 1;
                int d = 1;
                int b = 1;
                int a = n-(c+d+b);
                System.out.println(a + " " + b + " " + c + " " + d);


        }

    }
}
