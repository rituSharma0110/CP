package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String newStr = str.replace("+","");
        char [] array = str.toCharArray();
        int count =0;
        for (int i =0;i< array.length;i++){
            if (array[i]=='+'){
                count++;
            }
        }
        long [] numArray = new long[count+1];
        for (int i = 0; i < newStr.length(); i++)
        {
            numArray[i] = newStr.charAt(i) - '0';
        }
        Arrays.sort(numArray);
        for (int i =0;i<numArray.length-1;i++){
            System.out.print(numArray[i]+ "+");
        }
        System.out.print(numArray[numArray.length-1]);
        System.out.println();

    }
}
