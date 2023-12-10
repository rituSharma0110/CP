package com.company;

import java.util.Scanner;

public class Problem320A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String str = scanner.next();
        char [] array = str.toCharArray();
        int cnt =0;
        for (int i =0;i< array.length;i++){
            if (array[i]!='1' && array[i]!='4'){
                cnt++;
            }
        }
        String ans ="YES";
        if (cnt>=1){
            ans = "NO";
        }else if (str.charAt(0)=='1'){
            for (int i =0;i< array.length-2;i++){
                if (array[i]=='4' && array[i+1]=='4' && array[i+2]=='4'){
                    ans = "NO";
                    break;
                }else ans="YES";
            }
        }else {
            ans = "NO";
        }
        System.out.println(ans);

    }
}
