package com.company;
import java.util.*;

public class Problem1684C {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        out:
        while (tc-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] array = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = scanner.nextInt();
                }
            }
            int [][] clone = new int[n][m];
           for (int i =0;i<n;i++){
               for (int j =0;j<m;j++){
                   clone[i][j] = array[i][j];

               }Arrays.sort(clone[i]);
           }

           Set<Integer> set = new HashSet<>();
           for (int i =0;i<n;i++){
               for (int j =0;j<m;j++){
                   if (array[i][j]!= clone[i][j]){
                       set.add(j);
                   }
               }
           }

           if (set.size()>2) {
               System.out.println(-1);
               continue ;
           }

           int i = -1;
           int j =-1;
           int cnt =0;
           for (Integer val: set){
               if (cnt<1){
                   i = val;
                   cnt++;
               }else j = val;
           }

           if (i==-1 && j==-1){
               i=0;j=0;
           }
           for (int k =0;k<n;k++){
               int temp = array[k][i];
               array[k][i] = array[k][j];
               array[k][j] = temp;
           }
            for (int k =0;k<n;k++){
                for (int l =0;l<m;l++){
                    if (array[k][l]!=clone[k][l]){
                        System.out.println(-1);
                        continue out;
                    }
                }
            }
            System.out.println((i+1) + " " + (j+1));


        }
    }
}
