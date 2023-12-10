package com.company;

import java.util.Scanner;

public class Problem1206B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scanner.nextInt();
        int [] array = new int[size];
        int cntN = 0;
        int cntP = 0;
        for (int i =0;i< array.length;i++){
            array[i] = scanner.nextInt();

        }
        for (int i =0;i< array.length;i++) {
            if (array[i] < 0) {
                cntN++;
            } else {
                cntP++;
            }
        }
        int steps = 0;
        if (cntN%2!=0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i]<0 && i<=cntN-2){
                    steps += -1-array[i];
                }else if (array[i]< 0 && i == cntN-1){
                    steps += -1-array[i];
                }else {
                    steps += Math.abs(1-array[i]);

                }
            }
        }else {
            for (int i = 0; i < array.length; i++) {
                if (array[i]<0 && i<=cntN){
                    steps += -1-array[i];
                }else {
                    steps += Math.abs(1-array[i]);
                }
            }
        }
        System.out.println(steps);


    }
}
