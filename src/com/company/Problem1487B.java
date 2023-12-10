package com.company;

import java.util.Scanner;

public class Problem1487B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int spots = scanner.nextInt();
            int hr = scanner.nextInt();
            if (spots%2==0) {
                System.out.println((hr-1)%spots+1);
            }else {
                int k = hr+ (hr-1)/((spots-1)/2);
                System.out.println((k-1)%spots + 1);
            }

        }

    }
}
