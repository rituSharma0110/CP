package com.company;
import java.util.*;

public class Problem1426C {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while(tc-->0){
            int n = scanner.nextInt();
            if (n==1){
                System.out.println(0);
                continue;
            }
            int x = (int)Math.sqrt(n);
            int ans = 0;
            if (x*x==n){
                ans = 2*(x-1);
            }else {
                ans = (x) + (n-1)/(x+1);
            }
            System.out.println(ans);
        }
    }
}
