package com.company;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class Problem1700B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            String s = scanner.next();
            if (s.charAt(0) != '9') {
                for (int i = 0; i < n; i++) {
                    System.out.print(9 - (s.charAt(i) - '0'));
                }
                System.out.println();
            } else {
                BigInteger bigInteger = new BigInteger("1".repeat(n + 1));
                BigInteger res = bigInteger.subtract(new BigInteger(s));
               System.out.println(res);
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
