package com.company;

import java.io.*;
import java.util.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Problem1660C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0) {
            String str = scanner.next();
            char[] array = str.toCharArray();
            int ans = 0;
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < array.length; i++) {
                char c = str.charAt(i);
                if (set.contains(c)) {
                    ans += set.size() - 1;
                    set.clear();
                } else {
                    set.add(c);
                }
            }

            ans += set.size();
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
