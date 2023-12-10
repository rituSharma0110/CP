package com.company;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] array = new int[5][5];
        for (int i =0;i<5;i++){
            for (int j =0;j<5;j++){
               array[i][j]= scanner.nextInt();
            }
        }
        int a =0;
        int b =0;
        for (int i =0;i<5;i++){
            for (int j =0;j<5;j++){
                if (array[i][j]==1){
                    a=i+1;
                    b=j+1;

                }
            }
        }
        int ans = Math.abs(a-3) + Math.abs(b-3);
        System.out.println(ans);
    }
}
