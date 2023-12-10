package com.company;

import java.io.*;
import java.util.*;

public class Problem1492B {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            int size = scanner.nextInt();
            int [] array =new int[size];
            for (int i =0;i< array.length;i++){
                array[i] = scanner.nextInt();
            }
            boolean[] is = new boolean[size];
            int max = Integer.MIN_VALUE;
            for (int i =0;i<array.length;i++){
                if (array[i]>max){
                    max = array[i];
                    is[i] = true;
                }
            }
            int l = size;
            for (int i = size-1 ; i>=0;i--){
                if (is[i]){
                    for (int j = i ;j<l;j++){
                        System.out.print(array[j] + " ");
                    }
                    l = i;
                }

            }

            System.out.println();
        }

    }

//    static class Scanner {
//        StringTokenizer st;
//        BufferedReader br;
//
//        public Scanner(InputStream s) {
//            br = new BufferedReader(new InputStreamReader(s));
//        }
//
//        public Scanner(FileReader s) throws FileNotFoundException {
//            br = new BufferedReader(s);
//        }
//
//        public String next() throws IOException {
//            while (st == null || !st.hasMoreTokens())
//                st = new StringTokenizer(br.readLine());
//            return st.nextToken();
//        }
//
//        public int nextInt() throws IOException {
//            return Integer.parseInt(next());
//        }
//
//        public long nextLong() throws IOException {
//            return Long.parseLong(next());
//        }
//
//        public String nextLine() throws IOException {
//            return br.readLine();
//        }
//
//        public double nextDouble() throws IOException {
//            return Double.parseDouble(next());
//        }
//
//        public boolean ready() throws IOException {
//            return br.ready();
//        }
//    }
}
