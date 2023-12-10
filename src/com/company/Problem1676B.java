package com.company;
import java.util.*;

public class Problem1676B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int [] array = new int[n];
            int min = Integer.MAX_VALUE;
            int minIndex=0;
            for (int i=0;i< array.length;i++){
                array[i]= scanner.nextInt();
                min = Math.min(array[i],min);
                minIndex=i;
            }
            long sum =0;
            for (int i=0;i< array.length;i++){
                    array[i] -= min;
            }
            for (int i =0;i< array.length;i++){
                    sum+=array[i];
            }
            System.out.println(sum);
        }

    }
}
