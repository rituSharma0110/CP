package com.company;
import java.util.*;

public class Problem1517B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scanner.nextInt();
        while(tc-->0){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int [][] array = new int[n][m];
            int [][] res = new int[n][m];
            int [][] newArray = new int[n][m];
            Pair [] p = new Pair[n*m];

            for (int i=0;i<n;i++){
                Arrays.fill(res[i],-1);
                Arrays.fill(newArray[i],-1);
            }

            int k =0;
            for (int i=0;i<n;i++){
                for (int j =0;j<m;j++){
                    array[i][j]= scanner.nextInt();
                    p[k++]=new Pair(i,j,array[i][j]);
                }
            }
            Arrays.sort(p);
            k =0;
            for (int i=0;i<m;i++){
                Pair pair = p[i];
                int x = pair.i;
                int y = pair.j;
                newArray[x][y]=k;
                res[x][k]=array[x][y];
                k++;

            }
            for (int i=0;i<n;i++){
                k=0;
                for (int j =0;j<m;j++){
                    if (newArray[i][j]!=-1){
                        continue;
                    }
                    if (res[i][k]!=-1){
                        k++;
                        j--;
                        continue;
                    }
                    res[i][k++]=array[i][j];
                }
            }
            for (int i=0;i<n;i++){
                for (int j =0;j<m;j++){
                    System.out.print(res[i][j]+ " ");

                }
                System.out.println();
            }
        }
    }

    static class Pair implements Comparable<Pair>{
        int i;
        int j ;
        int val;

         Pair(int i, int j, int val) {
            this.i = i;
            this.j = j;
            this.val = val;
        }

        public int compareTo(Pair pair) {
            return Integer.compare(this.val, pair.val);
        }
    }
}
