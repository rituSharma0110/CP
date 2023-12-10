package com.company;

import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1419D1{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        Long [] array = new Long[n];
        for (int i =0;i< array.length;i++){
            array[i] = scanner.nextLong();
        }
        if (n%2==0){
            System.out.println(n/2-1);
        }else System.out.println(n/2);
        Arrays.sort(array,Collections.reverseOrder());
        long [] newArray = new long[n];
        int k = n-1;
        int j =0;
        for (int i =0;i<n ;i++){
            if (i%2!=0){
               newArray[i]=array[k];
               k--;
            }else
            {
                newArray[i]=array[j];
                j++;
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(newArray[i]+ " ");
        }
        System.out.println();
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
