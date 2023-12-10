package com.company;

import java.util.*;

public class Problem1080B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int l = scanner.nextInt();
            l--;
            int r = scanner.nextInt();
            long ans=0;
            if(r%2==0) {
                ans += (r / 2);
            }
            else {
                ans -= r / 2 + 1;
            }
            if(l%2==0) {
                ans -= (l / 2);
            }
            else {
                ans += l / 2 + 1;
            }

            System.out.println(ans);
        }
    }
}
