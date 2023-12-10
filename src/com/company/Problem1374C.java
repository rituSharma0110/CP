package com.company;

import java.util.Scanner;

public class Problem1374C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc= scanner.nextInt();
        while (tc-->0){
            int length = scanner.nextInt();
            String str = scanner.next();
            char[] array = str.toCharArray();
            int now = 0;
            int ans = 0;
            for (int i =0;i< array.length;i++){
                if (str.charAt(i)=='('){
                    now++;
                }else {
                    now--;
                    if (now<0){
                        now=0;
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }

    }
}
