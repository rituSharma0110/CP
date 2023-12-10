package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1380C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
   outer:     while (tc-->0){
            int length = scanner.nextInt();
            int k = scanner.nextInt();
            int [] array = new int[length];
            for (int i =0;i<length;i++){
                array[i] = scanner.nextInt();
            }
            int ans =0;
             Arrays.sort(array);
            for (int i = array.length-1;i>=0;i--){
                int cnt =1;
               while (i>=0 && array[i]*cnt<k){
                   cnt++;
                   i--;
               }
               if (i>=0 && cnt*array[i]>=k){
                   ans++;
               }

            }
       System.out.println(ans);
        }

    }
}
