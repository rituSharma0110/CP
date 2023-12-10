package com.company;
import java.util.*;

public class Problem1405B {
    static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int [] array = new int[n];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            
            long sum =0;
            for (int i =0;i< array.length;i++){
                sum += array[i];
                if (sum<0){
                    sum=0;
                }
            }
            System.out.println(sum);
        }

    }
}
