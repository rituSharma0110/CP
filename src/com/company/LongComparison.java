package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class LongComparison {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
          BigInteger firstNumber = scanner.nextBigInteger();
          int fZeroes = scanner.nextInt();
          BigInteger secondNumber = scanner.nextBigInteger();
          int sZeroes = scanner.nextInt();
          BigInteger ten = BigInteger.TEN;
          BigInteger finalNumber1 = firstNumber.multiply(ten.pow(fZeroes));
          BigInteger finalNumber2 = secondNumber.multiply(ten.pow(sZeroes));

            if (finalNumber2.equals(finalNumber1)){
                System.out.println("=");
            }else if (finalNumber1.compareTo(finalNumber2)>0){
                System.out.println(">");
            }else System.out.println("<");
        }
    }
}

//import java.util.Scanner;
//
//public class LongComparison {
//    public static Scanner scanner = new Scanner(System.in);
//    public static void main(String[] args) {
//        int tc = scanner.nextInt();
//        while (tc-->0){
//            int firstNumber = scanner.nextInt();
//            int fZeroes = scanner.nextInt();
//            int secondNumber = scanner.nextInt();
//            int sZeroes = scanner.nextInt();
//
//            long finalNumber1 = firstNumber*(long)Math.pow(10,fZeroes);
//            long finalNumber2 = secondNumber*(long)Math.pow(10,sZeroes);
//            if (finalNumber2==finalNumber1){
//                System.out.println("=");
//            }else if (finalNumber1>finalNumber2){
//                System.out.println(">");
//            }else System.out.println("<");
//        }
//    }
//}