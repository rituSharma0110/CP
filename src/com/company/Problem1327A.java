package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1327A {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while(tc-->0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            if (n%2==0 && k%2==0) {
                if ((long)k*k<=n){
                    System.out.println("YES");
                    continue;
                }
            }else if (n%2==1 && k%2==1){
                if ((long)k*k<=n){
                    System.out.println("YES");
                    continue;
                }
            }
            System.out.println("NO");
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
