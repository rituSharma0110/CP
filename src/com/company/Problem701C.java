package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem701C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        String str = scanner.next();
        int [] array = new int[1000005];
        char [] charArray = str.toCharArray();
        long st = 100001;
        long t=0;
        int k=0;
        for(int i=0;i<n;i++) {
            array[charArray[i]]++;
            t=array[charArray[i]];

            while(array[charArray[k]]>1) {
                array[charArray[k++]]--;
            }
            if(t==1) {
                st=i-k+1;
            }
            else {
                st=Math.min(st,i-k+1);
            }
        }
        System.out.println(st);


    }
}
