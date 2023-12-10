package com.company;
import java.util.*;

public class Problem1671A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            String str = scanner.next();
            if (str.length()==1){
                System.out.println("NO");
                continue;
            }
            if ((str.charAt(0)=='a' && str.charAt(1)=='b') || (str.charAt(0)=='b' && str.charAt(1)=='a' ) ){
                System.out.println("NO");
                continue;
            }
            if (((str.charAt(str.length()-2)=='a' && str.charAt(str.length()-1)=='b') )|| ((str.charAt(str.length()-2)=='b' && str.charAt(str.length()-1)=='a'))){
                System.out.println("NO");
                continue;
            }
            if (str.contains("aba")|| str.contains("bab")){
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");

        }
    }
}
