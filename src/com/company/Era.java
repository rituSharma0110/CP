package com.company;

import java.util.Scanner;

public class Era {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            int size = scanner.nextInt();
            int [] array = new int[size];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            int ans = 0;
            int max = maximum(array);
            for (int i =0;i< array.length;i++){
                if (array[i]==max){
//                    res = Math.abs((i+1)-array[i]);
                    ans = Math.max(ans,(array[i]-i-1));
                }
            }
            System.out.println(ans);

        }
    }
    static int maximum (int [] array){
        int max = array[0];
        for (int i =0;i< array.length;i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

}