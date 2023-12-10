package com.company;

import java.util.Scanner;

public class HQ9pLUS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String ans = "YES";
        for (int i =0;i<str.length();i++){
            if (str.charAt(i)=='H' || str.charAt(i)=='9' || str.charAt(i)=='Q'){
                ans = "YES";
                break;
            }else ans = "NO";
        }
        System.out.println(ans);

    }
}
