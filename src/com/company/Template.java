package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;



public class Template {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = 99898;
            sieve(n);
            for (int i =0;i<=n;i++){
                if (is_Prime[i]==1){
                    System.out.println("Yes");
                }else System.out.println("no");
            }

        }
    }
    static int [] is_Prime = new int[(int )1e6 + 10];
    static void sieve(int n){
        for(int i =0;i<=n ;i++){
            is_Prime[i]=1;
        }
        is_Prime[0]=0;
        is_Prime[1]=0;
        for (int i =0;i*i<=n;i++){
            if (is_Prime[i]==1){
                for (int j =2*i;j<=n;j+=1){
                    is_Prime[i*j]=0;
                }
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
