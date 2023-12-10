package com.company;
import java.util.*;

public class Problem1405A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int [] array = new int[n];
            for (int i =0;i<n;i++){
                array[i] = scanner.nextInt();
            }
            for (int i=n-1;i>=0;i--){
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }


    }
}
