package com.company;

import java.util.Scanner;

public class DominoDisaster {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            String string = scanner.next();
            String newString ="";
            for (int i =0;i<size;i++){
                if (string.charAt(i)=='U'){
                     string =string.replace('U','D');
                     break;
                }else if (string.charAt(i) =='D'){
                    string =string.replace('D','U');
                    break;
                }
            }
            System.out.println(string);
        }
    }
}
