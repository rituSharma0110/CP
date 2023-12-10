package com.company;

import java.util.Scanner;

public class Problem746B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        String str = scanner.next();
        char[] array = str.toCharArray();
        StringBuilder sbr = new StringBuilder();
        int k =n;
        for (int i =0;i<n;i++){
            if (k%2==1){
                sbr.append(array[i]);
            }
            else {
                sbr.insert(0,array[i]);
            }
            k--;
        }
        System.out.println(sbr);


    }
}
