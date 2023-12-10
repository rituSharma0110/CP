package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1401B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = 3;
            int [] arrayA = new int[size];
            int [] arrayB = new int[size];
            for (int i =0;i< arrayA.length;i++){
                arrayA[i] = scanner.nextInt();
            }
            for (int i =0;i< arrayA.length;i++){
                arrayB[i] = scanner.nextInt();
            }
            long sum =0;
            long min = Math.min(arrayA[2],arrayB[1]);
            sum+=2L*min;
            arrayA[2]-=min;
            arrayB[1]-=min;
            long max = Math.max(arrayB[2]-arrayA[2]-arrayA[0], 0);
            sum-=2L*max;

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
