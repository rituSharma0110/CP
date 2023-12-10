package com.company;

import java.util.Scanner;

public class Edu122B {
    public static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            String string = scanner.next();
            char[] array = string.toCharArray();
            int countOfZero = 0;
            int countOfOne = 0;
            for (int i =0;i< array.length;i++){
                if (array[i]=='0'){
                    countOfZero++;
                }else {
                    countOfOne++;
                }
            }
            if (string.length()==1){
                System.out.println(0);
                continue;
            }
            if (countOfZero<countOfOne){
                System.out.println(countOfZero);
            }else if(countOfOne<countOfZero){
                System.out.println(countOfOne);
            }else System.out.println(countOfZero-1);
        }

    }
}
