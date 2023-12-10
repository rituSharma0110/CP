package com.company;
import java.util.*;

public class Problem1656C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int length = scanner.nextInt();
            int [] array = new int[length];
            boolean isOne = false;
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
                if (array[i]==1){
                    isOne=true;
                }
            }
            Arrays.sort(array);
            boolean isPossible = false;
            for (int i =0;i< array.length-1;i++){
                if (array[i]+1 == array[i+1]){
                    isPossible = true;
                }
            }
            System.out.println((isPossible && isOne) ? "NO" : "YES");
        }

    }
}
