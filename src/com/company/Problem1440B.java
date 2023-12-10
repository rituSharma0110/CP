package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem1440B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int size = n*k;
            long [] array = new long[size];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextLong();
            }
            if (size==2){
                System.out.println(array[0]);
                continue;
            }

            if (n==2){
                int sum =0;
                int j =k;
                for (int i =0;i< array.length;i=i+2,j--){
                    if (j<=0){
                        break;
                    }else {
                        sum+=array[i];
                    }
                }
                System.out.println(sum);
                continue;

            }
            Arrays.sort(array);
            long ans =0;
            for(int i = 0, index = n * k - (n - (n + 1) / 2 + 1); i < k; i++, index -= (n - (n + 1) / 2 + 1)) {
                ans += array[index];
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
