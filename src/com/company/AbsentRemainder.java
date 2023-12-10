package com.company;
import java.util.*;

public class AbsentRemainder {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            int size = scanner.nextInt();
            int[] array = new int[size];
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
                min= Math.min(min,array[i]);
            }
            int n = array.length/2;
            for (int i =0;n!=0;i++){
                if (array[i]!= min) {
                    System.out.println(array[i] + " " + min);
                    n--;
                }
            }
        }
    }
}
