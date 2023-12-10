package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1400C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
     outer:    while (tc-->0){
            String str = scanner.next();
            int x = scanner.nextInt();
            char [] array = str.toCharArray();
            char [] newArray = new char[str.length()];
            Arrays.fill(newArray,'1');
            for (int i =0;i< array.length;i++){
                if(array[i]=='0'){
                    if(i-x>=0)
                        newArray[i-x]='0';
                    if(i+x<str.length())
                        newArray[i+x]='0';
                }
            }

            for (int i =0;i< array.length;i++){
                char ch='0';
                if(i+x<str.length() && newArray[i+x]=='1')
                    ch='1';
                if(i-x>=0 && newArray[i-x]=='1')
                    ch='1';
                if(ch!=str.charAt(i))
                {
                    System.out.println(-1);
                    continue outer;
                }
            }
            for (int i =0;i< array.length;i++){
                System.out.print(newArray[i]+"");
            }
             System.out.println();

        }
    }
}
