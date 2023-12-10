package com.company;

import java.util.Scanner;

public class Problem1525B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }

            int count =0;
            for (int i =0 ;i< array.length;i++){
                if (array[i] == i+1){
                    count++;
                }
            }
            if (count== array.length){
                System.out.println(0);
                continue;
            }


            if (array[0]==1 || array[size-1]==size){
                System.out.println(1);
            }else if (array[0]==size && array[size-1]==1){
                System.out.println(3);
            }else System.out.println(2);

        }
    }
}
