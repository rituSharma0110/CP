package com.company;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class DivideAndMultiply {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            BigInteger[] array = new BigInteger[size];
            int mul =0;
            for (int i=0;i< array.length;i++){
                array[i]= scanner.nextBigInteger();
                while (array[i].remainder(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0))){
                   mul++;
                   array[i]=array[i].divide(BigInteger.valueOf(2));
                }
            }

            Arrays.sort(array);
            for (int i =0;i<mul;i++){
                array[array.length-1]=array[array.length-1].multiply(BigInteger.valueOf(2));
            }

            BigInteger ans = BigInteger.ZERO;
            for (int i =0;i< array.length;i++){
                ans = ans.add((array[i]));
            }
            System.out.println(ans);

        }
    }


}
