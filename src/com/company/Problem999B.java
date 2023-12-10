package com.company;

import java.util.Scanner;

public class Problem999B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int length = scanner.nextInt();
        String str = scanner.next();
        char [] array = str.toCharArray();
        for (int i =1;i<=length;i++){
            if (length%i==0){
                for (int j = 0;j<i/2;j++){
                    char temp = array[j];
                    array[j] = array[i-j-1];
                    array[i-j-1]=temp;
                }
            }
        }
        for (int i =0;i< array.length;i++){
            System.out.print(array[i]+"");
        }
        System.out.println();


    }

}
