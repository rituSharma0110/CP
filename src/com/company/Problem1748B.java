package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1748B {
    static Scanner scanner = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String[] args) throws IOException{
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            String str = scanner.next();
            char [] array = str.toCharArray();
            int ans =0;
            for (int i =0;i<n;i++){
                char [] chars= new char[10];
                int max = 0;
                int distinct = 0;
                for (int j = i;j<i+101 && j<n;j++){
                    if (chars[array[j]-'0']==0){
                        distinct++;
                    }
                    max = Math.max(max, ++chars[array[j]-'0']);
                    if (max<=distinct){
                        ans++;
                    }
                }
            }
            out.println(ans);
            out.flush();
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
