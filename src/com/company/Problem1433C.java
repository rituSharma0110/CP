package com.company;
import java.util.*;
public class Problem1433C {
    public static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
    outer:    while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size];
        int max =0;
        for (int i =0;i< array.length;i++){
                array[i]=scanner.nextInt();
        }
        for (int i =0;i< array.length;i++){
            if (array[i]>array[max]){
                max = i;
            }
        }
        boolean equal = true;
        for (int i =0;i< array.length;i++){
            if (array[i]!=array[max]){
                equal = false;
            }
        }
        if (equal){
            System.out.println(-1);
            continue ;
        }

        for (int i =0;i< array.length;i++){
            if (array[i]==array[max]){
                if (i > 0 && array[i] > array[i - 1]) {
                    System.out.println(i+1);
                    continue outer;
                }
                if (i < array.length - 1 && array[i] > array[i + 1]) {
                    System.out.println(i+1);
                    continue outer;

                }
            }
        }
        }
    }
}
