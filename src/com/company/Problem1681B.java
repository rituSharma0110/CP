package com.company;
import java.util.*;

public class Problem1681B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while(tc-->0){
            int n = scanner.nextInt();
            int [] array = new int[n];
            for (int i =0;i<n;i++){
                array[i] = scanner.nextInt();
            }
            int m = scanner.nextInt();
            int[]  newArray = new int[m];
            long sum = 0;
            for (int i =0;i<m;i++){
                newArray[i] = scanner.nextInt();
                sum+=newArray[i];
                if (sum>=n){
                    sum -= n;
                }
            }
            int index =(int) sum%n;
            int val = array[index];
            System.out.println(val);

        }

    }
}
