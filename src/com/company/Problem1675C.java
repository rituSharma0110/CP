package com.company;
import java.util.*;

public class Problem1675C {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args){
        int tc = scanner.nextInt();
        while (tc-->0){
            String str = scanner.next();
            int n = str.length();
            if (str.charAt(0)=='0' || str.charAt(n-1)=='1') System.out.println(1);
            else {
                int start = 0;
                int end = n-1;
                for (int i =0;i<n;i++){
                    if (str.charAt(i)=='1'){
                        start = i;
                    }
                }

                for (int i = end;i>=0;i--){
                    if (str.charAt(i)=='0'){
                        end=i;
                    }
                }
                System.out.println(end-start+1);
            }
        }
    }
}
