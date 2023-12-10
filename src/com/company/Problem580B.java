package com.company;

import java.util.Scanner;

public class Problem580B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
            int size = scanner.nextInt();
            long [] array = new long[size];
            for (int i =0;i< array.length;i++){
                array[i]= scanner.nextLong();
            }
            if (size==1){
                System.out.println(1);

            }else {
                int cntI = 1;
                int max = Integer.MIN_VALUE;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] <= array[i + 1]) {
                        cntI++;
                    } else {
                        cntI = 1;
                    }
                    if (cntI > max) {
                        max = cntI;
                    }
                }
                System.out.println(max);
            }

        }
}
