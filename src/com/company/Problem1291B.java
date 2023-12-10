package com.company;
import java.util.*;

public class Problem1291B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            long [] array = new long[size];
            long sum =0;
            for (int i =0;i< array.length;i++){
                array[i]=scanner.nextLong();
                sum+=array[i];
            }
            if(size==2 ){
                if (sum>=1){
                    System.out.println("YES");
                }else System.out.println("NO");
                continue;
            }
            long mid = array[size/2];
            if (mid>=size/2){
                System.out.println("YES");
            }else System.out.println("NO");

        }
    }
}
