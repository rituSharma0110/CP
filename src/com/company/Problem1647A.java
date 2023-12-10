package com.company;

import java.util.Scanner;

public class Problem1647A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size];
            int cnt =size;
            int cnt1=0;
            for (int i =0;i< array.length;i++){
                array[i]= scanner.nextInt();
                if (array[i]==1){
                    cnt1++;
                }
            }
            if (size==2){
                System.out.println(0);
                continue;
            }
            if (cnt1==size){
                System.out.println(0);
                continue;
            }
            for (int i = array.length-1;i>=1;i--){
                if (array[i]==0){
                    break;
                }else cnt--;
            }
            for (int i =1;i< array.length;i++){
                if (array[i]==0){
                    break;
                }else cnt--;
            }



            System.out.println(cnt);

        }
    }
}
