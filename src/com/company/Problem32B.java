package com.company;

import java.util.Scanner;

public class Problem32B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String str = scanner.next();
        char [] array = str.toCharArray();
        String str1 = "";
        if (str.length()==1){
            System.out.println(0);

        }else {
            for (int i = 0; i < array.length ; i++) {
                if (array[i]=='-' && array[i+1]=='-'){
                    str1 += '2';
                    i++;
                }else if (array[i]=='-' && array[i+1]=='.'){
                    str1 += '1';
                    i++;
                }else {
                    str1 +='0';
                }
            }
            System.out.println(str1);
        }

    }
}
