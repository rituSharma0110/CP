package com.company;
import java.util.*;

public class Problem1335A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            long n = scanner.nextLong();
            if(n==2||n==1){
                System.out.println(0);
                continue;
            }
            if (n%2==0){
                System.out.println(n/2-1);
            }else System.out.println(n/2);

        }

    }
}
