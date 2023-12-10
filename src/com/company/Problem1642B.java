package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Problem1642B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n=scanner.nextInt();
            int[] array =new int[n];
            HashSet<Integer> set=new HashSet<>();
            for (int i = 0; i < array.length; i++) {
                array[i]=scanner.nextInt();
                set.add(array[i]);
            }
            for (int i = 0; i < set.size(); i++) {
                System.out.print(set.size()+" ");
            }
            for(int i=1;i<=n-set.size();i++){
                System.out.print(set.size()+i+" ");
            }
            System.out.println();
        }
    }
}
