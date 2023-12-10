package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1699B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int [][] array = new int[n][m];
            for (int i =0;i<n;i++){
                for (int j =0;j<m;j++){
                    if (i%4==0 || i%4==3){
                        if (j%4==0 || j%4==3){
                            array[i][j]=0;
                        }else array[i][j]=1;
                    }else {
                        if (j%4==1|| j%4==2){
                            array[i][j]=0;
                        }else array[i][j]=1;
                    }
                }
            }

            for (int i =0;i<n;i++){
                for (int j =0;j<m;j++){
                    System.out.print(array[i][j]+ " ");
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
