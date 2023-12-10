package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1551B1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            String string = scanner.next();
            char [] array = string.toCharArray();
            int count = 1;
            int currentCount =1;
            Arrays.sort(array);
            for (int i =0;i< array.length-1;i++){
                if (array[i]==array[i+1])
                    currentCount++;
                else currentCount=1;
                if (currentCount<=2){
                    count++;
                }
            }
            System.out.println(count/2);

        }
    }
}
