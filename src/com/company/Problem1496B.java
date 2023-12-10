package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Problem1496B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int k = scanner.nextInt();

            int [] array = new int[size];
            for (int i =0;i< array.length;i++){
                array[i]=scanner.nextInt();
            }
            if (k==0){
                System.out.println(size);
                continue;
            }

            Arrays.sort(array);
            Set<Long> set = new HashSet<>();
            for (int i = 0; i < size; i++) {
                set.add((long) array[i]);
            }

            long mex = 0;
            for (long i = 0; i <= size+1 ; i++) {
                if (!set.contains(i)) {
                    mex = i;
                    break;
                }
            }
            long max = array[size - 1];
            if (mex == max + 1) {
                System.out.println(size+k);
            } else {
                long now = (mex + max + 1) / 2;
                if (set.contains(now)) {
                    System.out.println(size);
                } else {
                    System.out.println(size+1);
                }
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
