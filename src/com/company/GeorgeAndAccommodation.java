package com.company;

import java.util.Scanner;

public class GeorgeAndAccommodation {
  public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        int cnt =0;
        while (tc-->0) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();

            if (q-p>=2){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
