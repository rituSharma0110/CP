package com.company;

import java.util.Scanner;

public class LuntikAndConcerts {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int [] array = new int[3];
            int [] songArray = new int[3];

            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            songArray[0] = array[0];
            songArray[1] = 2*array[1];
            songArray[2] = 3*array[2];

            int sum = songArray[0] + songArray[1] + songArray[2];
            if (sum%2==0) System.out.println(0);
            else System.out.println(1);
        }
    }
}
