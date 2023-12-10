package com.company;

import java.util.Scanner;

public class Problem1373B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            String str = scanner.next();
            char [] array = str.toCharArray();
            int cnt0=0;
            int cnt1=0;
            for (int i =0;i< array.length;i++){
                if (array[i]=='0'){
                    cnt0++;
                }else cnt1++;
            }
            if (str.length()==1){
                System.out.println("NET");
                continue;
            }
            if (cnt0==1){
                System.out.println("DA");
                continue;
            }
            int cntBoth = cnt0+cnt1;
           if (cnt0==cnt1){
               cntBoth/= 2;
               if (cntBoth%2==0){
                   System.out.println("NET");
               }else {
                   System.out.println("DA");
               }
           }else if (cnt0!=cnt1){
               if (cnt0<cnt1){
                   if (cnt0%2==0){
                       System.out.println("NET");
                   }else System.out.println("DA");
               }else {
                   if (cnt1%2==0){
                       System.out.println("NET");
                   }else System.out.println("DA");
               }
           }
        }
    }
}
