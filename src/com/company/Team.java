package com.company;

import java.util.Scanner;

public class Team {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int row = scanner.nextInt();
        int sol =0;
        while (row>0){
            int [] array = new int[3];
            int count =0;
            for (int i =0;i<3;i++){
                array[i]= scanner.nextInt();
                if (array[i]==1) {
                    count++;
                }
            }
            if (count>=2){
                sol++;
            }
            row--;
        }
        System.out.println(sol);
    }
}
