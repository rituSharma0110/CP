package com.company;

import java.io.*;
import java.util.*;

public class Problem1613C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            long h = scanner.nextLong();
            int  [] array = new int[n];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            long l = 0;
            long hi = h;
            while (l<=hi){
                long mid = l + (hi-l)/2;
                long sum = mid;
                for (int i =0;i< array.length-1;i++){
                    sum+= Math.min(mid, array[i+1]-array[i]);
                }
                if (sum<h){
                    l = mid+1;
                }else hi = mid-1;
            }

            System.out.println(hi+1);

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
