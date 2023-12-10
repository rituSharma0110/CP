package com.company;

import java.util.Scanner;

public class Elections {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       int tc = scanner.nextInt();
       while (tc-->0){
           int [] array = new int[3];
           for (int i =0;i< array.length;i++){
               array[i] = scanner.nextInt();
           }

           for (int i =0;i< array.length;i++){
               int max = maximum(array);
                if (array[0]==array[1] &&array[2]==array[1]){
                    System.out.print(1 + " ");

                }else if (array[i] == max){
                   System.out.print(0 + " ");
               }else {
                    int diff = max -array[i] +1;
                    if (diff > max){

                    }
               }
           }
           System.out.println();
       }
    }
    static int maximum(int [] array){
        int max = array[0];
        for (int i =0;i< array.length;i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}
