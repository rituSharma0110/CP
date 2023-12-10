package com.company;
import java.util.*;

public class Problem1682A {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            String str = scanner.next();
            int val = n / 2;
            int cnt =0;
            for (int i =n/2;i>=1;i--){
                if (str.charAt(i)==str.charAt(i-1)){
                    cnt++;
                }else break;
            }
            for (int i =n/2;i<n-1;i++){
                if (str.charAt(i)==str.charAt(i+1)){
                    cnt++;
                }else break;
            }
            System.out.println(cnt+1);

        }

    }
}
