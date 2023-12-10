package com.company;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String revStr = scanner.next();
        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        String str2 = sbr.toString();
        if (str2.equals(revStr)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
