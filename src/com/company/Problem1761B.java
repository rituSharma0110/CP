package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1761B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int length = scanner.nextInt();
            int [] array = new int[length];
            int [] hash = new int[length+1];
            for (int i =0;i<length;i++){
                array[i]= scanner.nextInt();
                hash[array[i]]++;
            }
            int cnt =0;
            for (int i =0;i<length+1;i++){
                if(hash[i]!=0){
                    cnt++;
                }
            }
            int ans =0;
            if(cnt==2){
                if(length%2==0) {
                    ans = length / 2 +1;
                }else {
                    ans = length / 2 +2;
                }
            }else {
                ans = length;
            }
            System.out.println(ans);
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
