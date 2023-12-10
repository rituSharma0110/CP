package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1324A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array = new int[size];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            Arrays.sort(array);
            String ans = "YES";
      outer:      for (int i =0;i< array.length;i++){
                for (int j =i+1;j< array.length;j++){
                    if ((array[j]- array[i])%2!=0){
                        ans = "NO";
                        break outer;

                    }else ans = "YES";
                }
            }
            System.out.println(ans);
        }
    }
}
