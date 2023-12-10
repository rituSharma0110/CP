package com.company;

import java.io.*;
import java.util.*;

public class Problem1441B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int size = scanner.nextInt();
        int [] array = new int[size];
        for (int i =0;i< array.length;i++){
            array[i] = scanner.nextInt();
        }
        int cnt =0;
        int max =0;
        for(int i = 0; i < size; i++){
            if(array[i] == 1){
                cnt++;
            } else{
                cnt = 0;
            }

            max = Math.max(cnt,max);
        }

        if(array[size - 1] == 1 && array[0] == 1){
            for(int i = 0; i < size; i++){
                if(array[i] == 1){
                    cnt++;
                } else{
                    break;
                }
            }
            max = Math.max(max,cnt);
        }
        System.out.println(max);


    }


}
