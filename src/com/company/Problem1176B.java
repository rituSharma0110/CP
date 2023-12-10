package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1176B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int [] array = new int[n];
            int cnt0 = 0;
            int cnt1 = 0;
            int cnt2 = 0;
            for (int i =0;i<n;i++){
                array[i]= scanner.nextInt();
                if (array[i]%3==0){
                    cnt0++;
                }else if (array[i]%3==1){
                    cnt1++;
                }else cnt2++;
            }
            if (cnt1 == cnt2) {
                System.out.println(cnt0 + cnt1);
            } else if (cnt1 > cnt2) {
                System.out.println(cnt0 + cnt2 + (cnt1 - cnt2) / 3);
            } else {
                System.out.println(cnt0 + cnt1 + (cnt2 - cnt1) / 3);
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
