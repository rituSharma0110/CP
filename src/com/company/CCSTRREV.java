package com.company;

import java.io.*;
import java.util.*;
import java.util.StringTokenizer;


public class CCSTRREV {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int tc = scanner.nextInt();
        while (tc-->0){
            String str = scanner.next();
            StringBuilder str1 = new StringBuilder(str);
            char [] arrayA = str.toCharArray();
            str1.reverse();
            String str2 = str1.toString();
            char [] arrayB = str2.toCharArray();
            int cnt =0;
            for (int i =0;i<str.length();i++){
                if (arrayA[i]==arrayB[cnt]){
                    cnt++;
                }
            }
            System.out.println(str.length()-cnt);
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
