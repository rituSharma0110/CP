package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1690D {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            String str = scanner.next();
            int left = 0;
            int right = 0;
            int black = 0;
            int white = 0;
            int min = Integer.MAX_VALUE;
            while(right < k) {
                if(str.charAt(right) == 'W') {
                    white++;
                }else {
                    black++;
                }
                right++;
            }
            min = Math.min(min, white);
            while(right < n) {
                if(str.charAt(left) == 'W')
                    white--;
                else black--;
                if(str.charAt(right) == 'W')
                    white++;
                else black++;
                left++;
                right++;
                min = Math.min(min, white);
            }
            System.out.println(min);


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
