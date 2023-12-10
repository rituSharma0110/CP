package com.company;
import  java.util.*;

public class Problem1582B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int [] array = new int[n];
            int cntZero=0;
            int cntOne =0;
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            for (int i =0;i< array.length;i++){
                if (array[i]==0){
                    cntZero++;
                }else if (array[i]==1)cntOne++;

            }

            long ans = (long) Math.pow(2,cntZero);
            ans*=cntOne;
            System.out.println(ans);
        }

    }
}
