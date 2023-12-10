package com.company;
import java.util.*;

public class Project1491B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n= scanner.nextInt();
            int u= scanner.nextInt();
            int v= scanner.nextInt();
            int ans = Integer.MAX_VALUE;
            int [] array = new int[n];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }

            for (int i =1;i<n;i++){
                if(Math.abs(array[i] - array[i - 1]) >= 2){
                    ans = 0;
                }
                if(Math.abs(array[i] - array[i - 1]) == 1){
                    ans = Math.min(ans, Math.min(u, v));
                }
                if(array[i] == array[i - 1]){
                    ans = Math.min(ans, v + Math.min(u, v));
                }
            }
            System.out.println(ans);

        }

    }
}
