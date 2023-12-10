package com.company;
import java.util.*;


public class Problem1409B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            long n = scanner.nextLong();
            long ans =Math.min(calc(a,b,x,y,n),calc(b,a,y,x,n));

            System.out.println(ans);


        }

    }
    static long calc(long a,long b, long x,long y, long n ){
        long rem = Math.min(a - x, n);
        a -= rem;
        n -= rem;
        rem = Math.min(b - y, n);
        b -= rem;
        return a * b;
    }
}