package com.company;

import java.util.Scanner;

public class Problem1511A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            int count1=0;
            int count2=0;
            int count3=0;
            for (int i =0;i< array.length;i++){
                if (array[i]==1){
                    count1++;
                }else if (array[i]==3){
                    count3++;
                }
            }
            int ans = count1+count3;
            System.out.println(ans);
        }
    }
}
