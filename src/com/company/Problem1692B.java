package com.company;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Problem1692B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-- > 0) {
            int n = scanner.nextInt();
            HashSet<Integer> elements = new HashSet<>();
            for (int j = 0; j < n; j++) {
                elements.add(scanner.nextInt());
            }
            int length= elements.size();
            if ((n % 2 == 0 && length % 2 == 0) || (n % 2 == 1 && length % 2 == 1)) {
                System.out.println(length);
            } else {
                System.out.println(length - 1);
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
