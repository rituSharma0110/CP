package com.company;
import java.util.*;

public class Problem1670A {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            int cnt =0;
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
                if (array[i] < 0) {
                    cnt++;
                    array[i]*=-1;
                }
            }

            for (int i =0;i<cnt;i++){
                array[i]*=-1;
            }
            boolean isPossible = isSorted(array);
            System.out.println(isPossible ? "YES" : "NO");
        }
    }

    static  boolean isSorted(int [] array){
        for (int i=0;i< array.length-1;i++){
            if (array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }


}
