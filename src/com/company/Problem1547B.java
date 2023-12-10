package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1547B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
    out:    while (tc-->0){
            char []array =scanner.next().toCharArray();
            int n=array.length;
            int curr=n-1,l=0,r=n-1;
            while(curr>=0) {
                if(array[l]==(char)('a'+curr)) {
                    curr--;
                    l++;
                }
                else if(array[r]==(char)('a'+curr)) {
                    curr--;
                    r--;
                }
                else {
                    System.out.println("NO");
                    continue out;
                }
            }
            System.out.println("YES");
        }
    }
}
