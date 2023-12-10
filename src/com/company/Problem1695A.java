package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1695A {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int [][] array = new int[n][m];
            for (int i =0;i<n;i++){
                for (int j=0;j<m;j++){
                    array[i][j] = scanner.nextInt();
                }
            }

            int maxI = 0;
            int maxJ = 0;

            for (int i =0;i<n;i++) {
                for (int j =0;j<m;j++){
                    if (array[i][j]>array[maxI][maxJ]){
                        maxI=i;
                        maxJ=j;
                    }
                }
            }
            int h = Math.max(maxI+1, n-maxI);
            int w = Math.max(maxJ+1, m-maxJ);
            System.out.println(h*w);

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
