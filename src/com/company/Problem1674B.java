package com.company;
import java.util.*;

public class Problem1674B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            String str = scanner.next();
            int ans =0;
            int val1 = str.charAt(0)%96 ;
            int val2 = str.charAt(1)%96 ;
            if (val1>val2){
                ans = 25*(val1-1) + val2;
            }else {
                ans= 25*(val1-1) + val2-1;
            }

            System.out.println(ans);

        }
    }
}
