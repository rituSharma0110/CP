package com.company;

import java.util.Scanner;

public class Problem1537B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();
            int antonX = scanner.nextInt();
            int antonY = scanner.nextInt();

            if((antonX==1 && antonY==1) || (antonX==rows && antonY==cols)){
                System.out.println(1 + " " + cols + " " + rows + " " + 1);
            }else {
                System.out.println(1 + " " + 1 + " " + rows + " " + cols);
            }

        }
    }
}
