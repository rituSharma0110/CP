package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem1401C {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
    outer:    while (tc-->0){
            int size = scanner.nextInt();
            long [] array = new long[size];
            long min = Long.MAX_VALUE;
            for (int i =0;i< array.length;i++){
                array[i]=scanner.nextLong();
                min = Math.min(array[i],min );
            }
            long [] newArray = array.clone();
            Arrays.sort(newArray);
            String ans ="YES";
            for (int i =0;i< array.length;i++){
                if (array[i]!=newArray[i] && array[i]%min>0){
                    System.out.println("NO");
                    continue outer;
                }
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
