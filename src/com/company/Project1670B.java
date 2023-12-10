package com.company;

import java.io.*;
import java.util.*;

public class Project1670B {
    static Scanner scanner = new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-- > 0) {
            int n = scanner.nextInt();
            String str = scanner.next();
            int val = scanner.nextInt();
            Set<Character> special = new HashSet<>();
            for (int i = 0; i < val; i++)
                special.add((scanner.next().charAt(0)));

            int prev = 0;
            int res = 0;
            for (int i = 0; i < n; i++) {
                if (special.contains(str.charAt(i))) {
                    res = Math.max(res, i - prev);
                    prev=i;

                }
            }
            out.println(res);
        }
        out.close();
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
