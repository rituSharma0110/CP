package com.company;

import java.util.Scanner;

public class Problem935B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int length = scanner.nextInt();
        String str = scanner.next();
        int x =0;
        int y =0;
        int cnt =0;
        for (int i =0;i<length;i++){
            if (str.charAt(i)=='U'){
                y++;
            }else x++;

            if (x==y && i<length-1 && str.charAt(i)==str.charAt(i+1) ){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
