package com.company;
import java.util.*;

public class Problem1717B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int r = scanner.nextInt() -1;
            int c = scanner.nextInt() -1;

            int moves = n/k;
            char [][] array = new char[n][n];
            for (int i =0;i<n;i++){
                for (int j =0;j<n;j++){
                    array[i][j] = '.';
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < moves; j++) {
                    array[r][c] = 'X';
                    c += k;
                    c %= n;
                }
                r++;
                r %= n;
                c++;
                c %= n;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println();
            }

        }

    }
}
