package com.company;
import java.util.*;

public class Problem1647B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
    out:    while (tc-->0){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int [][] array = new int[n][m];
            for (int i =0;i<n;i++){
                String str = scanner.next();
                for (int j =0;j<m;j++){
                    array[i][j]= Integer.parseInt(String.valueOf(str.charAt(j)));
                }
            }
            if (m==1 || n==1){
                System.out.println("YES");
                continue;
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < m - 1; j++) {
                    int sum = array[i][j] + array[i][j + 1] + array[i + 1][j] + array[i + 1][j + 1];
                    if (sum == 3) {
                        System.out.println("NO");
                        continue out;
                    }
                }
            }
        System.out.println("YES");

        }

    }
}
