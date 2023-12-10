package com.company;

import java.util.Scanner;

public class InsearchOfEasyProb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i =0;i< array.length;i++){
            array[i]= scanner.nextInt();
        }
        int cnt =0;
        for (int i =0;i< array.length;i++){
            if (array[i]==1){
                cnt++;
            }
        }
        if (cnt>=1){
            System.out.println("HARD");
        }else System.out.println("EASY");
    }
}
