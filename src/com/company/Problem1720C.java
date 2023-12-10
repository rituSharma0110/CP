package com.company;

import java.util.Scanner;

public class Problem1720C {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while(tc-->0){
            int n= scanner.nextInt();
            int m = scanner.nextInt();
            int [][] mat= new int[n][m];
            int cnt =0;
            for (int i =0;i<n;i++){
                String str = scanner.next();
                for (int j =0;j<m;j++){
                    mat[i][j]= str.charAt(j)-'0';
                    if (mat[i][j]==1){
                        cnt++;
                    }
                }
            }

            int ones=0;
            int min = Integer.MAX_VALUE;
            for (int i =0;i<n-1;i++){
                for (int j =0;j<m-1;j++){
                    ones= (int)(mat[i][j] + mat[i + 1][j] + mat[i][j + 1] + mat[i + 1][j + 1]);
                    if (ones==0){
                        continue;
                    }else {
                        min= Math.min(min, Math.max(1, ones-1));
                    }
                }
            }

            if (cnt==0){
                System.out.println(0);
            }else System.out.println(1+ cnt-min);




        }
    }
}
