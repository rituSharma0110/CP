package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1750B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        int tc = scanner.nextInt();
        while (tc-->0){
            int length = scanner.nextInt();
            String str = scanner.next();
            long ans =0;
            long zeroC = 0;
            long oneC = 0;
            for (int i =0;i<str.length();i++){
                if (str.charAt(i)=='0')
                    zeroC++;
                else oneC++;
            }
            if (length==1){
                System.out.println(1);
                continue;
            }
             ans = zeroC * oneC;
            long cnt = 1;
            for (int i = 0; i < str.length()-1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    cnt++;
                } else {
                    ans = Math.max(ans, cnt * cnt);
                    cnt = 1;
                }
            }
            System.out.println(Math.max(ans, cnt * cnt));
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
