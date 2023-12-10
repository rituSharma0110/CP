package com.company;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
//        if (str.charAt(0)>=65 && str.charAt(0)<=90){
//            System.out.println(str);
//
//        }else {
//            char [] array = str.toCharArray();
//            array[0] = (char) ((char) str.charAt(0) - 32);
//            for (int i =0;i< array.length;i++){
//                System.out.print(array[i]);
//            }
//            System.out.println();
            char ch = 'a';
        System.out.println((char)ch^32);
        }
}
