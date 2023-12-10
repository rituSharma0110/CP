package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.util.StringTokenizer;

public class ProblemCR777A {
    public static Scanner scanner = new Scanner(System.in);
    public static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            if(n%3==0) {
                while(n>0) {
                    out.print("21");
                    n-=3;
                }
            } else if(n%3==1) {
                   out.print("1");
                n--;
                while(n>0) {
                    out.print("21");
                    n-=3;
                }
            } else {
                out.print("2");
                n-=2;
                while(n>0) {
                    out.print("12");
                    n-=3;
                }
            }
            out.println();

        }
        out.flush();
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
