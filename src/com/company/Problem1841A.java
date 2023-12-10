package com.company;

import java.io.*;
import java.util.*;

public class Problem1841A {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int testCase = scanner.nextInt();
        while (testCase-->0){
            int n = scanner.nextInt();

            if(n<=4){
                System.out.println("Bob");
            }else{
                System.out.println("Alice");
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
    }
}
