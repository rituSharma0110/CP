package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MinorReduction {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int number = scanner.nextInt();
            String temp = Integer.toString(number);
            int[] newNumber= new int[temp.length()];
            for (int i = 0; i < temp.length(); i++)
            {
                newNumber[i] = temp.charAt(i) - '0';
            }
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> list1 = new ArrayList<>();
            StringBuilder sb = new StringBuilder(Arrays.toString(newNumber));
            int sum= 0;
            for (int i =0;i<newNumber.length-1;i++){
                sum = newNumber[i] +newNumber[i+1];
                StringBuilder sb1 = new StringBuilder(sum);

                sb.replace(i,i+1, String.valueOf(sb1));

            }
            System.out.println(sb);
        }

    }
}

