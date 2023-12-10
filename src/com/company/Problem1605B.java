package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem1605B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            String string = scanner.next();
            char[] array = string.toCharArray();
            char[] array2 = string.toCharArray();
            ArrayList<Integer> indexList = new ArrayList<>();
            Arrays.sort(array);
            int count =0;
            for (int i =0;i< array.length;i++){
                if (array[i]!=array2[i]){
                    indexList.add(i+1);
                    count++;
                }
            }
            if (indexList.size()==0){
                System.out.println(0);
                continue;
            }

            System.out.println(1);
            System.out.print(count + " ");
            for (int i =0;i<indexList.size();i++){
                System.out.print(indexList.get(i) + " ");
            }
            System.out.println();

        }
    }
}
