package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem1462C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
          while (tc-->0){
            int number = scanner.nextInt();
            if (number>45){
                System.out.println(-1);
                continue;
            }
              ArrayList<Integer> list = new ArrayList<>();
            for (int i =9;i>0;i--){
                if (number>=i){
                    list.add(i);
                    number= number-i;
                }
            }
              Collections.sort(list);
            for (int i =0;i<list.size();i++){
                System.out.print(list.get(i));
            }
              System.out.println();
        }
    }
}
