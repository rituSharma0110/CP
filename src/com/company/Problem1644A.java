package com.company;

import java.util.Scanner;

public class Problem1644A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            String str = scanner.next();
            char [] array = str.toCharArray();
            String ans = "YES";
            for (int i =0;i< array.length;i++){
                for (int j =0;j< array.length;j++){
                    if (array[i]=='r' && array[j]=='R'||array[i]=='g' && array[j]=='G' || array[i]=='b' && array[j]=='B'){
                        if (j-i<0){
                            ans = "NO";
                            break;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
