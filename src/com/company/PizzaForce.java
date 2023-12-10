package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class PizzaForce {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            long num = scanner.nextLong();
            long x = num/6;
            long y = num%6;
            if (num<=6){
                System.out.println(15);
            }else if (y==0){
                System.out.println(x*15);
            }else if (y<=2){
                System.out.println(x*15 + 5);
            }else if (y<=4){
                System.out.println(x*15 + 10);
            }else{
                System.out.println((x+1)*15);
            }
        }
    }
}
