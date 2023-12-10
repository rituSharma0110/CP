package com.company;

import java.util.Scanner;

public class Problem1515A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int explode = scanner.nextInt();
            int [] array = new int[size];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            int sum1 =0;
            for (int i =0;i< array.length;i++){
                sum1+=array[i];
            }
            if (sum1==explode){
                System.out.println("NO");
                continue;
            }else System.out.println("YES");

            int sum = 0;
            String ans = "";
            for (int i =0;i< array.length;i++){
                if (sum!=explode){
                    sum +=array[i];
                }else {
                   for (int j =0;j< array.length-1;j++){
                       int temp = array[j];
                       array[j] = array[j+1];
                       array[j+1] = temp;
                   }
                }
            }
            for (int i =0;i< array.length;i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();


        }
    }

}
// undone
