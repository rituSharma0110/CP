package com.company;

import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String str = scanner.next();
        char [] array = str.toCharArray();
        int cnt =0;
        for (int i =0;i< array.length-1;i++){
            if (array[i]==array[i+1]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
