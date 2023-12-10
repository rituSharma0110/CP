package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problem34B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scanner.nextInt();
        int max = scanner.nextInt();
        int [] array = new int[size];
        for (int i =0;i< array.length;i++){
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        int sum =0;

        for (int i =0;i< array.length;i++){
            if (array[i]<0 && max>0){
                sum+=Math.abs(array[i]);
                max--;
            }
        }
        System.out.println(sum);

    }
}
