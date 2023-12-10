package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem1265B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc  = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int[] orArray = new int[n];
            int[] pstArray = new int[n + 1];
            for(int i = 0; i < n; i++) {
                orArray[i] = scanner.nextInt();
                pstArray[orArray[i]] = i;
            }
            boolean[] beautiful = new boolean[n + 1];
            beautiful[1] = true;
            int l = pstArray[1], r = pstArray[1];
            for(int m = 2; m <= n; m++) {
                int next = pstArray[m];
                if (next < l) {
                    l = next;
                }
                else if (next > r) {
                    r = next;
                }
                int dist = r - l + 1;
                if (dist == m) {
                    beautiful[m] = true;
                }
            }
            for(int i = 1; i <= n; i++) {
                System.out.print(beautiful[i] ? '1': '0');
            }
            System.out.println();

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
