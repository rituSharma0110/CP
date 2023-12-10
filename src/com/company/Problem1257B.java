package com.company;
import java.util.*;

public class Problem1257B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
           while (tc-->0){
            int n = scanner.nextInt();
            int y = scanner.nextInt();
            if (n==y){
                System.out.println("YES");
                continue;
            }
            if (n==1){
                System.out.println("NO");
                continue;
            }
            if (n>3){
                System.out.println("YES");
                continue;
            }
            if (y<=3){
                System.out.println("YES");
                continue;
            }
               System.out.println("NO");

        }
    }
}
