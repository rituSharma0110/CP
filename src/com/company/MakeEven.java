package com.company;

import java.util.Scanner;

public class MakeEven {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int number = scanner.nextInt();
            int revNumber= reverse(number);
            int s = sum(number);
            boolean isOdd = answer(number);
            if (number%2==0){
                System.out.println(0);
            }else if (revNumber%2==0){
                System.out.println(1);
            }else if (isOdd &&number%2!=0 && revNumber%2!=0){
                System.out.println(2);
            }else System.out.println(-1);
        }
    }
    static int reverse(int number ) {
        int num =0;
        while (number > 0){
            int remainder = number % 10;
        num = num * 10 + remainder;
        number = number / 10;
    }

        return num;
    }
    static int sum (int number){
        int summation =0;
      while (number>0){
          int remainder = number%10;
          summation += remainder;
          number = number/10;
      }
      return summation;
    }
    static boolean answer (int number){
        boolean isOdd = false;
        while (number>0){
            int remainder = number%10;
            if (remainder%2==0){
                isOdd = true;
                break;
            }else isOdd =false;
            number =number/10;
        }
        return isOdd;
    }

}
