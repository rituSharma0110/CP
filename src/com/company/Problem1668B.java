package com.company;
import java.util.*;

public class Problem1668B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int [] array = new int[n];
            for (int i =0;i< array.length;i++){
                array[i]= scanner.nextInt();
            }
            Arrays.sort(array);
            long sum = n + array[n-1];
            for (int i = 1; i < n; i++) {
                sum += array[i];
            }
            if (sum<=m){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}
