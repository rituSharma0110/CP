package com.company;

import java.util.Scanner;

public class LifeOfAFlower {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
       outer: while (tc-->0){
            int size = scanner.nextInt();;
            int [] array = new int[size];
            for (int i =0;i< array.length;i++){
                array[i] =scanner.nextInt();
            }
            int height=1;
            for (int i =0;i< array.length-1;i++){
                if (array[i]==0 && array[i+1]==0){
                    System.out.println(-1);
                    continue outer;
                }
            }
            for (int i =0;i< array.length-1;i++){
                if (array[i]==1 && array[i+1]==1){
                    height=height+5;
                }else if (array[i]==1){
                    height+=1;
                }else if (array[i]==0) height+=0;
            }
            if (array[array.length-1]==1){
                height+=1;
            }else if (array[array.length-1]==0){
                height+=0;
            }
           System.out.println(height);
        }
    }
}
