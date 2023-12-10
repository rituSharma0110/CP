package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArrays {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size];
            int [] array1 = new int[size];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            for (int i =0;i< array.length;i++){
                array1[i] = scanner.nextInt();
            }
            Arrays.sort(array);
            Arrays.sort(array1);
            String ans = "YES";
            for (int i =0;i< array.length;i++){
                if (array[i]==array1[i]){
                    ans = "Yes";
                }else if (array[i] + 1 !=array1[i]){
                    ans = "NO";
                    break;
                }else ans = "Yes";
            }
            System.out.println(ans);
        }
    }
}
