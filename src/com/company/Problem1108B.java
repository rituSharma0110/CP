package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1108B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        int [] array = new int[n];
        int [] hsh = new int[(int)1e4+10];
        for (int i =0;i<n;i++){
            array[i] = scanner.nextInt();
            hsh[array[i]]++;
        }
        if (n==2){
            System.out.println(array[0] + " " + array[1]);

        }else {
            Arrays.sort(array);
            int val = 0;
            for (int i = 0; i < n; i++) {
                if (array[n - 1] % array[i] != 0) {
                    val = array[i];
                } else if (hsh[array[i]] == 2) {
                    val = array[i];
                }
            }
            System.out.println(array[n - 1] + " " + val);
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
