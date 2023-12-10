package com.company;
import java.util.*;

public class Problem1686A {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while(tc-->0){
            int n = scanner.nextInt();
            int [] array = new int[n];
            int sum =0;
            for (int i =0;i<n;i++){
                array[i] = scanner.nextInt();
                sum+=array[i];
            }
            boolean flag = false;
            double val =(double) sum/n;
            for (int i=0;i<n;i++){
                if (array[i]==val){
                    flag = true;
                }
            }
            System.out.println(flag? "YES":"NO");
        }
    }
}
