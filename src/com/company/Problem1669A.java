package com.company;
import java.util.*;

public class Problem1669A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int a = scanner.nextInt();
            if (a<=1399){
                System.out.println("Division 4");
            }else if (1400<=a && a <=1599){
                System.out.println("Division 3");
            }else if (1600 <= a && a <=1899){
                System.out.println("Division 2");
            }else System.out.println("Division 1");
        }
    }
}
