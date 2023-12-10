package com.company;
import java.util.*;

public class Problem1671C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int length = scanner.nextInt();
            int x = scanner.nextInt();
            Long [] array = new Long[length];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextLong();
            }
            Arrays.sort(array);
            long sum =0;
            long p =0;
            for (int i=0;i< array.length;i++){
                sum+=array[i];
                if (sum<=x){
                    p +=((x-sum)/(i+1))+1;
                }
            }
            System.out.println(p);
        }
    }
}
