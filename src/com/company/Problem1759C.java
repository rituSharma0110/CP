package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1759C {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args) throws IOException{
        int tc = scanner.nextInt();
        while (tc-->0){
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int x = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(a==b){
                System.out.println(0);
                continue;
            }
            if(a+x>=r && a-x<=l){
                System.out.println(-1);
            }else if(b-a>=x){
                System.out.println(1);
            }else if(b+x<=r && b-x>=l){
                System.out.println(2);
            }else System.out.println(3);

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
