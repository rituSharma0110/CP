package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1747B {
    static Scanner scanner = new Scanner(System.in);
    static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String[] args) throws IOException{
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int k = 3*n;
            if( n%2==0){
                n/=2;
            }else if(n!=1 && n%2!=0){
                n/=2;
                n+=1;
            }
            out.println(n);
            int first = 1;
            for (int i =0;i<n;i++){
                out.println(first + " " + k);
                first+=3;
                k-=3;
            }
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
