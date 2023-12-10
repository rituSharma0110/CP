package com.company;

import java.util.Scanner;

public class CasimirStringSolitaire {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            String string = scanner.next();
            int noOfAs = 0;
            int noOfBs = 0;
            int noOfCs = 0;

            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == 'A') {
                    noOfAs++;
                } else if (string.charAt(i) == 'B') {
                    noOfBs++;
                } else noOfCs++;
            }
            if (noOfBs==(noOfAs + noOfCs)){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}
