package com.company;
import java.math.BigInteger;
import java.util.*;

public class Problem1674C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
     out:   while (tc-->0){
            String str = scanner.next();
            String t = scanner.next();
            if (t.length()==1){
                if (t.charAt(0)=='a'){
                    System.out.println(1);
                    continue ;
                }
            }
            for (int i =0;i<t.length();i++){
                if (t.charAt(i)=='a'){
                    System.out.println(-1);
                    continue out;
                }
            }
         BigInteger val = BigInteger.valueOf(2);
            val = val.pow(str.length());
         System.out.println(val);

        }
    }
}
