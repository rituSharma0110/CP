package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problem160A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scanner.nextInt();
        int [] array = new int[size];
        int sum = 0;
        for (int i =0;i< array.length;i++){
            array[i] = scanner.nextInt();
            sum+=array[i];

        }
        int cnt =0;
        Arrays.sort(array);
        int sum1 = 0;
        for (int i = array.length-1;i> 0;i--){
            sum1+=array[i];
            if (sum1<=(sum-sum1)){
                cnt++;
            }
        }
        System.out.println(cnt+1);
    }

}
