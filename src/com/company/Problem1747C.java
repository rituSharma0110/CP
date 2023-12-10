package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1747C {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException  {
        int tc = scanner.nextInt();
        while (tc-->0){
            int length = scanner.nextInt();
            int [] array = new int[length];
            for (int i =0;i<length;i++){
                array[i] = scanner.nextInt();
            }
            int min = Integer.MAX_VALUE;
            for (int i =0;i<length;i++){
                if (array[i]<min){
                    min = array[i];
                }
            }
            if(array[0]>min){
                System.out.println("ALICE");
            }else {
                System.out.println("BOB");
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
