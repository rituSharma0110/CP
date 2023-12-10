package com.company;
import java.util.*;
public class Problem1692A {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int [] array = new int[4];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            int cnt =0;
            for (int i =1;i< array.length;i++){
                if(array[i]>array[0]){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }

    }
}
