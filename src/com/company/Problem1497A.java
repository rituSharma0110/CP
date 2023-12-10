package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem1497A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            Arrays.sort(array);
            int count =0;
            for (int i =0;i< array.length-1;i++){
                    if (array[i]==array[i+1]){
                        count++;
                    }
                }
            int [] newArray = new int[count];
            int j =0;
            for (int i =0;i< array.length-1;i++){
                    if (array[i]!=array[i+1]){
                        System.out.print(array[i] + " ");
                    }else {

                        newArray[j]= array[i];
                        j++;
                    }
            }
            System.out.print(array[array.length-1] + " ");
            for (int i =0;i< newArray.length;i++){
                System.out.print(newArray[i] + " ");
            }
            System.out.println();

        }
    }
}
