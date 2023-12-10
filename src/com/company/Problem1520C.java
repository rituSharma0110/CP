package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1520C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            if (n==2){
                System.out.println(-1);
                continue;
            }

            int [][]mat = new int[n][n];
            int val = 1;
            for (int i =0;i<mat.length;i++){
                for (int j =0;j< mat.length;j++){
                    if ((i+j)%2==0){
                        mat[i][j]=val;
                        val++;
                    }
                }
            }
            for (int i =0;i<mat.length;i++){
                for (int j =0;j< mat.length;j++){
                    if ((i+j)%2!=0){
                        mat[i][j]=val;
                        val++;
                    }
                }
            }
            for (int i =0;i<mat.length;i++){
                for (int j =0;j< mat.length;j++){
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
        }
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
