package com.company;

import java.util.Scanner;

public class Problem1499B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            char [] array = scanner.next().toCharArray();
            boolean invalid = false;
            boolean twoOnes = false;
            for(int i = 1; i < array.length; i++)
            {
                if(array[i-1] == '1' && array[i] == '1')
                    twoOnes = true;

                if(twoOnes && array[i-1] == '0' && array[i] == '0')
                    invalid = true;
            }
            System.out.println(invalid? "NO" : "YES");

        }
    }
}
