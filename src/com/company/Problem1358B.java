package com.company;
import java.util.*;

public class Problem1358B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            int size = scanner.nextInt();
            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }

            Arrays.sort(array);
            int cnt =0;
            int sum =1;
            for (int i =0;i< array.length;i++){
                if (array[i]<=cnt+sum){
                    sum=sum + 1+ cnt;
                    cnt=0;
                }else {
                    cnt++;
                }
            }
            System.out.println(sum);
        }
    }
}
