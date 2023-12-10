package com.company;
import java.util.*;

public class Problem1680A {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            if (a==b && c==b && c==d ){
                System.out.println(a);
                continue;
            }
            if (d>=a && c<=b){
                System.out.println(Math.max(a,c));
            }else System.out.println(c+a);


        }
    }
}
