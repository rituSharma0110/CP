package com.company;
import java.util.*;

public class Problem1312B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int length = scanner.nextInt();
            Integer [] array = new Integer[length];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            Arrays.sort(array);
            Collections.reverse(Arrays.asList(array));
            for (int i =0;i< array.length;i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
