package com.company;

import java.util.Scanner;

public class Expression {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int [] array = new int[5];
        array[0] = a + b*c;
        array[1] = a* (b+c);
        array[2] = a*b*c;
        array[3] = (a+b)*c;
        array[4] = a+b+c;
        int max =0;
        for (int i =0;i< array.length;i++){
            max = Math.max(array[i],max );
        }
        System.out.println(max);

    }
}
