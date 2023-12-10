package com.company;
import java.util.*;

public class Problem1436B {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-- > 0) {
            int n = scanner.nextInt();
            boolean isPrime = checkForPrime(n);
            int [] [] array = new int [n][n];

            if (isPrime){
                for (int i =0;i< n;i++){
                    for (int j =0;j< n;j++){
                        System.out.print((1) + " ");
                    }
                    System.out.println();
                }
            }else {
                for (int i =0;i< array.length;i++){
                    array[i][i] = 4;
                    array[i][(i+1)%n]=1;
                }

                for (int i =0;i<array.length;i++){
                    for (int j =0;j<array.length;j++){
                        System.out.print(array[i][j] + " ");
                    }  System.out.println();


                }

            }

        }

    }

    static boolean checkForPrime(int inputNumber) {
        boolean isItPrime = true;

        if (inputNumber <= 1) {
            isItPrime = false;

        } else {
            for (int i = 2; i <= inputNumber / 2; i++) {
                if ((inputNumber % i) == 0) {
                    isItPrime = false;

                    break;
                }
            }

        }
        return isItPrime;
    }
}
