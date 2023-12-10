package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problem149A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int size = 12;
        int total = scanner.nextInt();
        int[] array = new int[size];
        int sum1 =0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            sum1 +=array[i];
        }
        if(sum1<total){
            System.out.println(-1);
        }
        else if (total == 0) {
            System.out.println(0);
        } else {
            Arrays.sort(array);
            int sum = 0;
            int cnt = 0;
            for (int i = array.length-1;i>=0;i--){
                sum+=array[i];
                cnt++;
                if (sum>=total){
                    System.out.println(cnt);
                    break;
                }
            }

        }
    }
}
