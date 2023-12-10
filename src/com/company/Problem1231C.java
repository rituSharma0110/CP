package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1231C {
    static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [][] array =  new int[n][m];
        for (int i =0 ; i<n;i++){
            for (int j =0;j<m;j++){
                array[i][j] = scanner.nextInt();
            }
        }
        boolean flag = true;
   out:     for (int i =n-1;i>=1;i--){
            for (int j =m-1;j>=1;j--){
                if (array[i][j]==0){
                    array[i][j]=Math.min(array[i][j+1], array[i+1][j])-1;

                }
            }
        }
        int sum =0;
        for(int i=0;i<n;i++)
            for(int j=0;j<m-1;j++)
                if(array[i][j]>=array[i][j+1]) {
                    flag=false;
                    break;
                }

       if (flag){
           for(int i=0;i<m;i++)
               for(int j=0;j<n-1;j++) {
                   if(array[j][i]>=array[j+1][i]) {
                       flag=false;
                       break;
                   }
               }
       }


        for (int i =0;i<n;i++) {
            for (int j = 0; j < m ; j++) {
                sum += array[i][j];
            }
        }
        if (flag){
            System.out.println(sum);
        }else System.out.println(-1);


    }
    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader s) throws FileNotFoundException {
            br = new BufferedReader(s);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}
