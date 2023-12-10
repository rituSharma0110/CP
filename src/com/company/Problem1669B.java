package com.company;
import java.io.*;
import java.util.*;

public class Problem1669B {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
    outer:    while (tc-->0){
            int n = scanner.nextInt();
            int [] array = new int[n];
            int [] hsh = new int[n+1];
        for (int i =0;i< array.length;i++){
                array[i]= scanner.nextInt();
                hsh[array[i]]++;
            }
            for (int i =1;i<hsh.length;i++){
                if (hsh[i]>=3){
                    System.out.println(i);
                    continue outer;
                }
            }
        System.out.println(-1);

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
