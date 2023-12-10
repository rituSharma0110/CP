package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1205A {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            System.out.print(1 + " ");
            for(int i = 4; i < 2*n; i += 4) {
                System.out.print(i + " " + (i+1) + " ");
            }
            for(int i = 2; i < 2*n; i += 4) {
                System.out.print(i + " " + (i+1) + " ");
            }
            System.out.print(2*n);
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
