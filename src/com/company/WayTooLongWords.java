package com.company;

import java.util.Scanner;

public class WayTooLongWords {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            String str = scanner.next();
            if (str.length()>10) {
                StringBuilder sb = new StringBuilder("");
                sb.append(str.charAt(0));
                sb.append(str.length() - 2);
                sb.append(str.charAt(str.length() - 1));
                System.out.println(sb);
            }else System.out.println(str);
        }
    }
}
