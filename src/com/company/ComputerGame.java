package com.company;

import java.util.Scanner;

public class ComputerGame {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0) {
            int col = scanner.nextInt();
            String [] array = new String[2];
            for (int i =0;i<2;i++){
                array[i] = scanner.next();
            }

            for (int i =0;i<2-1;i++){
                for (int j=1;j<col-1;j++){
                    if (array[i].charAt(j)=='1' && array[i+1].charAt(j)=='1'){
                        System.out.println("NO");
                        break;
                    }else if (array[1].charAt(col-1)=='1'){
                        System.out.println("NO");
                        break;
                    }
                        else
                     {
                        System.out.println("YES");
                        break;
                    }
                }
            }



        }
    }
}