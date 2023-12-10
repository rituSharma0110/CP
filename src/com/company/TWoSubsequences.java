package com.company;

import java.util.Scanner;

public class TWoSubsequences {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            String string = scanner.next();
            char[] array = string.toCharArray();
            char min = minimum(array);
            Character mi = min;
            String s1 = "";
            String s2 = "";

            for (int i=0;i< array.length;i++){
                if (array[i]==min){
                    s1 = String.valueOf(min);
                    int index = string.indexOf(s1);
                    s2 = string.replaceFirst(s1, "");
                }
            }


            System.out.print(s1 + " ");
            System.out.println(s2);
        }
    }
    static char minimum(char[] array){
        char min = array[0];
        for (int i =0;i< array.length;i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }


}
