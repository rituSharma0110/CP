package com.company;
import java.util.*;

public class Problem1698A {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int [] array = new int[n];
            for (int i =0;i<n;i++){
                array[i] = scanner.nextInt();
            }

            System.out.println(array[0]);
        }

    }
}
