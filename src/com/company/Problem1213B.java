package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1213B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while(tc-->0){
            int n = scanner.nextInt();
            int [] array = new int[n];
            int min = Integer.MAX_VALUE;
             for (int i=0;i<n;i++){
                 array[i] = scanner.nextInt();
             }
             int ans =0;
             for (int i =n-1;i>=0;i--){
                 if (array[i]>min){
                     ans++;
                 }
                 min = Math.min(array[i], min);
             }
            System.out.println(ans);
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
