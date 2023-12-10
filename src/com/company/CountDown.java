package com.company;

import java.util.Scanner;

public class CountDown {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            String numString = scanner.next();

            int [] array = new int[numString.length()];
            for (int i =0;i<numString.length();i++){
                array[i] = numString.charAt(i) -'0';
            }
            int count = 0;
            for (int i = array.length-1;i>=0;i--){
                if (array[i]==0){
                    count+=0;
                }else if (array[array.length-1]!=0){
                    while (array[i]>0){
                        array[i]-=1;
                        count+=1;
                    }
                }else {
                    while (array[i]>0){
                        array[i]-=1;
                        count+=1;
                    }
                    count+=1;
                }
            }
            System.out.println(count);
        }

    }
}
