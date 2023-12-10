package com.company;

import java.util.Scanner;

public class Problem977B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int length = scanner.nextInt();
        String str = scanner.next();
        String ans = "";
        int max = 0;
        for (int i =0;i<length-1;i++){
            int cnt =0;
            for (int j =0;j<length-1;j++){
                if (str.charAt(i)==str.charAt(j) && str.charAt(j+1)==str.charAt(i+1)){
                    cnt++;
                }
                if (cnt>max){
                    max = cnt;
                    ans = str.charAt(i) + "" + str.charAt(i+1);
                }
            }
        }
        System.out.println(ans);
    }
}
