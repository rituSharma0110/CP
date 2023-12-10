package com.company;

import java.util.Scanner;

public class TimeComplexity {
    public static void main(String[] args) {
        int x = 1; // -->1 iteration
        int y = x + x;//--> 1 iteration
        System.out.println(y);//--> 1 iteration

        // total time complexity --> O(3)
        Scanner scanner = new Scanner(System.in);
        int n = 10000;//--> 1 iteration
        int[] array = new int[n];//--> 1 iteration
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }//--> 10000 iterations == N

        // total time complexity = O(2) + O(10000)= O(n)

//        N = 100000
        int cnt = 0;//--> 1 iteration
        int num = 100000;//--> 1 iteration
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                cnt++;//--> 1 iteration
            }
        }//--> O(2) + O(n^2)

        int count =0;
        int num1 = 100000;//--> 1 iteration
        while (n>0){
            n=n/2;
            // O(log(n))
        }
    }
}
/*
Important points :
1. we can perform 10^8 iterations in 1 second in C++;
2. But for Java these iterations are going to be processed in 2 seconds .
3. Many CP platforms have enhanced there platform such that they give 2 seconds for java to process 10^8 iterations
4. to be on safe side 10^7 is considered to be completed in 1 sec.
5.For , 10^8 = 10 sec
6.For , 10^9 = 100 sec
7.For , 10^10 = 1000 sec --> 15 min
8.CP programmers try to convert O(n) into O(log(n))

 */

