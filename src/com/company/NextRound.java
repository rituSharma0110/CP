package com.company;

import java.util.Scanner;

public class NextRound {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int count =0;
        int [] array = new int[n];
        int sum =0;
        for(int i =0;i< array.length;i++){
            array[i]= scanner.nextInt();
            sum+=array[i];

        }
        int val = array[k-1];
        for (int i =0;i< array.length;i++){
            if (array[i]>=val && array[i]!=0){
                count++;
            }
        }
        if (sum==0){
            count=0;
        }
        System.out.println(count);
    }
}
