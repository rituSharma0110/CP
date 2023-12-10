package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1183B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int k = scanner.nextInt();
            int [] array = new int[size];
            for (int i =0;i< array.length;i++){
                array[i]= scanner.nextInt();
            }
            Arrays.sort(array);
            long ans = 0;
            if (array[size-1]-array[0]>2*k){
                ans =-1;
            }else ans = array[0]+k;
            System.out.println(ans);
        }

    }
}
