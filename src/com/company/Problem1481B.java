package com.company;

import java.util.Scanner;

public class Problem1481B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int k = scanner.nextInt();
            int [] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }

            int ans=-1 ;
            while (k-->0) {
                ans = -1;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] < array[i + 1]) {
                        ans = i;
                        break;
                    }
                }
                if (ans==-1){
                    break;
                }
                array[ans]++;
            }
            if (ans==-1){
                System.out.println(-1);
            }else {
                System.out.println(ans+1);
            }

        }
    }
}
