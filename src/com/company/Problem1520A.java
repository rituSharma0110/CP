package com.company;

import java.util.Scanner;

public class Problem1520A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            String string = scanner.next();
            char [] array = string.toCharArray();
            String ans = "YES";
            for (int i =0;i< array.length;i++){
                for (int j =0;j< array.length;j++){
                  char c = string.charAt(j);
                  for (int k = string.indexOf(c);k<string.lastIndexOf(c);k++){
                      if (string.charAt(k)!=c){
                          ans = "NO";
                          break;
                      }
                  }

                }
            }
            System.out.println(ans);
        }
    }
}
