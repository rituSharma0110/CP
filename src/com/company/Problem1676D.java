package com.company;
import java.util.*;

public class Problem1676D {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int [][] array = new int[n][m];
            for (int i =0;i<n;i++){
                for (int j =0;j<m;j++){
                    array[i][j] = scanner.nextInt();
                }
            }

            int max =0;
            for (int i=0;i<n;i++){
                for (int j =0;j<m;j++){
                    int current =0;
                    int ci =i,cj=j;
                    while (ci>=0 && ci<n && cj>=0 && cj<m){
                        current+=array[ci][cj];
                        ci--;
                        cj--;
                    }
                    ci = i;
                    cj = j;
                    while(ci >= 0 && ci < n && cj >= 0 && cj < m)
                    {
                        current+=array[ci][cj];
                        ci++;
                        cj--;
                    }
                    ci = i;
                    cj = j;
                    while(ci >= 0 && ci < n && cj >= 0 && cj < m)
                    {
                        current+=array[ci][cj];
                        ci--;
                        cj++;
                    }
                    ci = i;
                    cj = j;
                    while(ci >= 0 && ci < n && cj >= 0 && cj < m)
                    {
                        current+=array[ci][cj];
                        ci++;
                        cj++;
                    }
                    current-=array[i][j]*3;
                    max = Math.max(max, current);
                }
            }
            System.out.println(max);

        }

    }
}
