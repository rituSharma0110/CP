package com.company;
import java.util.*;

public class Problem1721B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt()-1;
            int m = scanner.nextInt()-1;
            int x = scanner.nextInt()-1;
            int y = scanner.nextInt()-1;
            int d = scanner.nextInt();

            if ((y-d<=0 || x+d>=n) && (y+d>=m || x-d<=0)){
                System.out.println(-1);
            }else System.out.println(n+m);


        }

    }
}
