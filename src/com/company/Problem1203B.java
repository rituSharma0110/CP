package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1203B {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int [] array = new int[n*4];
            for (int i =0;i<n*4;i++){
                array[i] = scanner.nextInt();
            }

            Arrays.sort(array);
            int area = array[0]*array[array.length-1];
            boolean isPossible = true;
            for (int i =0;i<n;i++){
                int l = i*2;
                int r = 4*n-(i*2)-1;
                if (array[l] != array[l + 1] || array[r] != array[r - 1] || (long) array[l] * array[r] != area) {
                    isPossible = false;
                    break;
                }
            }

            System.out.println(isPossible? "YES" : "NO");

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
