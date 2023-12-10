package com.company;
import java.util.*;

public class Problem1450B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
     testCases:   while (tc-->0){
            int points = scanner.nextInt();
            int k = scanner.nextInt();
            int [] x = new int[points];
            int [] y = new int[points];
            for (int i =0;i<points;i++){
                x[i] = scanner.nextInt();
                y[i] = scanner.nextInt();
            }
         outer: for (int i=0; i< x.length; i++) {
             for (int j=0; j< y.length; j++) {
                 if (Math.abs(x[i]-x[j])+Math.abs(y[i]-y[j])>k) {
                     continue outer;
                 }
             }
             System.out.println(1);
             continue testCases;
         }
         System.out.println(-1);

        }
    }
}
