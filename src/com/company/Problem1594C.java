package com.company;
import java.util.*;

public class Problem1594C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
    out:    while (tc-->0){
            int n = scanner.nextInt();
            String s = scanner.next();
            String str = scanner.next();
            boolean isPossible = true;
            for (int i =0;i<str.length();i++){
                if (str.charAt(i)!=s.charAt(0)){
                    isPossible = false;

                }
            }
            if (isPossible){
                System.out.println(0);
                continue;
            }
            int i = n/2 +1;

            for (;i<=str.length();i++){
                if (str.charAt(i-1)==s.charAt(0)){
                    System.out.println(1);
                    System.out.println(i);
                    continue out;
                }

            }
        System.out.println(2);
        System.out.println(n + " " + (n-1));



        }
    }
}
