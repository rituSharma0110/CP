package com.company;
import java.util.*;

public class Problem1420B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        StringBuilder sb = new StringBuilder("");
        while(tc-->0) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            long sum =0;
            for (int i=31;i>=0;i--){
                int count =0;
                for (int j =0;j<n;j++){
                    if ((array[j]&(1<<i))>0&& array[j]!=-1 ){
                        count++;
                        array[j]=-1;
                    }
                }
                sum += (long) count *(count-1)/2;

            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);

    }
}
