package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class LineLandMail {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
            int size = scanner.nextInt();
            int [] array = new int[size];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
        Arrays.sort(array);

        for (int i =0;i< array.length;i++){
            int x = Math.abs(array[i] - array[0]);
            int y =  Math.abs(array[i] - array[size-1]);
            int max = Math.max(x,y);
            int u = Integer.MAX_VALUE;
            int v = Integer.MAX_VALUE;
            if(i > 0) {
                u = array[i] - array[i-1];
            }
            if(i < size-1) {
                v = array[i+1] - array[i];
            }
            int min = Math.min(u,v);
            System.out.println(min+" "+max);
        }
    }
}
