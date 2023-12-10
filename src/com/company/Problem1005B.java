package com.company;

import java.util.Scanner;

public class Problem1005B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String str1 = scanner.next();
        int a = str1.length();
        String str2 = scanner.next();
        int b = str2.length();
        char [] array1 = str1.toCharArray();
        char [] array2 = str2.toCharArray();
        int cnt1 =0;
        int k =0;
        if (a>=b){
            int j =str2.length()-1;
            for (int i =str1.length()-1;i>=0;i--,j--){
                if (array1[i]!=array2[j]){
                    cnt1=k;
                    break;
                }else {
                    k++;
                }
                if (j==0){
                    cnt1=b;
                    break;
                }
            }
        }else {
            int j =str1.length()-1;
            for (int i =str2.length()-1;i>=0;i--,j--){
                if (array2[i]!=array1[j]){
                    cnt1=k;
                    break;
                }else {
                    k++;
                }
                if (j==0){
                    cnt1=a;
                    break;
                }
            }
        }

            int ans = str1.length() + str2.length() - (cnt1*2);
            System.out.println(ans);

    }
}
