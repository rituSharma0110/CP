package com.company;

import java.util.Scanner;

public class MochaAndMath {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size];
            for (int i =0;i< array.length;i++){
                array[i] =scanner.nextInt();
            }
            int ans = array[0];
            for (int i =0;i< array.length;i++){
                ans = ans&array[i];
            }
            System.out.println(ans);
        }
    }

}
