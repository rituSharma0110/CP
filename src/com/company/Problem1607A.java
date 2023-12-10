package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1607A {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            String str = scanner.next();
            String query = scanner.next();
            int sum =0;
            for(int i=1;i<query.length();i++){
                sum += Math.abs(str.indexOf(query.charAt(i)) - str.indexOf(query.charAt(i-1)));
            }
            System.out.println(sum);
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
