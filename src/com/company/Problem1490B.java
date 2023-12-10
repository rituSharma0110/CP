package com.company;

import java.util.Scanner;

public class Problem1490B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size];
            for (int i=0;i< array.length;i++ ){
                array[i]= scanner.nextInt();
            }
            int cnt0=0;
            int cnt1=0;
            int cnt2=0;
            for (int i =0;i< array.length;i++){
                int remainder = array[i]%3;
                if (remainder==0){
                    cnt0++;
                }else if (remainder==1){
                    cnt1++;
                }else cnt2++;
            }
            System.out.println(Math.max((cnt0-cnt2), Math.max((cnt2-cnt1), (cnt1-cnt0))));
        }
    }
}
