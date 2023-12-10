package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem1490C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
    outer:    while (tc-->0){
            int num = scanner.nextInt();
//            long  low = 1;
//            long high = (long) Math.cbrt(num);
//            while (low<=high){
//                long current = low*low*low + high*high*high;
//                if (current==num){
//                    System.out.println("YES");
//                    continue outer;
//                }
//                if (current<num){
//                    low++;
//                }else high--;
//
//
//            }
//            System.out.println("NO");
//
        for (int i =1;(long)i*i*i<=num;i++){
            int a =  i*i*i;
            int b = num-a;
            if (b==0){
                continue ;
            }
            int c = (int) Math.cbrt(b);
            if (c*c*c==b){
                System.out.println("YES");
                continue  outer;
            }


        }
        System.out.println("NO");


        }

    }


}
